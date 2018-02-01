package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbOrderItemMapper;
import com.zhou.jdshop.dao.TbOrderMapper;
import com.zhou.jdshop.dao.TbOrderShippingMapper;
import com.zhou.jdshop.dao.TbOrdersCustomMapper;
import com.zhou.jdshop.dubbo.service.OrderService;
import com.zhou.jdshop.pojo.po.*;
import com.zhou.jdshop.pojo.vo.TbOrdersCustom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbOrderMapper ordersDao;

    @Autowired
    private TbOrdersCustomMapper ordersCustomDao;

    @Autowired
    private TbOrderItemMapper tbOrderItemDao;

    @Autowired
    private TbOrderShippingMapper tbOrderShippingDao;

    /**
     * 查询所有订单
     *
     * @return
     */
    @Override
    public List<TbOrder> listOrders() {
        List<TbOrder> list = null;
        try {
            list = ordersCustomDao.selectByExample(null);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }


    /**
     * 删除选中订单
     *
     * @param ids 选中的订单详情ID
     * @return
     */
    @Override
    public int deleteOrderItems(List<String> ids) {
        int i = 0;
        try {
            TbOrderItem tbOrderItem = new TbOrderItem();
            tbOrderItem.setTitle("0");
            TbOrderItemExample example = new TbOrderItemExample();
            TbOrderItemExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i = tbOrderItemDao.updateByExampleSelective(tbOrderItem, example);
         /*   TbOrder order =new TbOrder();
            order.setStatus(0);
            TbOrderExample example = new TbOrderExample();
            TbOrderExample.Criteria criteria = example.createCriteria();
//            criteria.andOidIn(ids);
            i = ordersDao.updateByExampleSelective(order,example);*/
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 根据ID查询订单
     *
     * @param id
     * @return
     */
    @Override
    public TbOrdersCustom getOrderById(String id) {
        TbOrdersCustom ordersCustom = null;
        try {
            ordersCustom = ordersCustomDao.selectOrderById(id);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ordersCustom;
    }

    /**
     * 修改订单
     *
     * @param
     * @return
     */
    @Transactional
    @Override
    public int editOrder(String title, String id, String orderId, String num, String totalFee, String receiverName, String receiverMobile, String receiverAddress) {
        int i = 0;
        try {
            //存放3张表,订单表和订单详情表和tb_order_shipping
            //tb_orders
           /* TbOrderExample example = new TbOrderExample();
            TbOrderExample.Criteria criteria = example.createCriteria();
            criteria.andOrderIdEqualTo(orderId);
            i=ordersDao.updateByExampleSelective(orders,example);*/
            //   tb_order_item
            TbOrderItem tbOrderItem = new TbOrderItem();
            tbOrderItem.setNum(Integer.parseInt(num));
            tbOrderItem.setTotalFee(Double.parseDouble(totalFee));
            tbOrderItem.setTitle(title);
            TbOrderItemExample example1 = new TbOrderItemExample();
            TbOrderItemExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andIdEqualTo(id);
            i += tbOrderItemDao.updateByExampleSelective(tbOrderItem, example1);

            //tb_order_shipping
            TbOrderShipping tbOrderShipping = new TbOrderShipping();
            tbOrderShipping.setReceiverName(receiverName);
            tbOrderShipping.setReceiverMobile(receiverMobile);
            tbOrderShipping.setReceiverAddress(receiverAddress);
            TbOrderShippingExample example2 = new TbOrderShippingExample();
            TbOrderShippingExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andOrderIdEqualTo(orderId);
            i += tbOrderShippingDao.updateByExampleSelective(tbOrderShipping, example2);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int insert(TbOrder record) {
        System.out.println("Hello");
        return 0;
    }

    @Override
    public void insertOrderItem(TbOrderItem orderitem) {

    }
}
