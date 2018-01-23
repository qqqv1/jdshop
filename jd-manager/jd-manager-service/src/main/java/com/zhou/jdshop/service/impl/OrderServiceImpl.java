package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.OrdersCustomMapper;
import com.zhou.jdshop.dao.TbOrderItemMapper;
import com.zhou.jdshop.dao.TbOrderMapper;
import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.po.TbOrderExample;
import com.zhou.jdshop.pojo.vo.OrdersCustom;
import com.zhou.jdshop.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbOrderMapper ordersDao;

    @Autowired
    private OrdersCustomMapper ordersCustomDao;

    @Autowired
    private TbOrderItemMapper orderitemDao;

    /**
     * 查询所有订单
     * @return     */
    @Override
    public List<TbOrder> listOrders() {
        List<TbOrder> list=null;
        try {
            list = ordersCustomDao.selectByExample(null);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }


    /**
     * 删除选中订单
     * @param oids
     * @return
     */
    @Override
    public int deleteOrders(List<String> oids) {
        int i = 0;
        try {
            TbOrder order =new TbOrder();
//            order.setState(0);
            TbOrderExample example = new TbOrderExample();
            TbOrderExample.Criteria criteria = example.createCriteria();
//            criteria.andOidIn(oids);
            i = ordersDao.updateByExampleSelective(order,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 根据ID查询订单
     * @param itemid
     * @return
     */
    @Override
    public OrdersCustom getOrderById(String itemid) {
        OrdersCustom ordersCustom = null;
        try {
            ordersCustom = ordersCustomDao.selectOrderById(itemid);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return ordersCustom;
    }

    /**
     * 修改订单
     * @param
     * @return
     */
    @Transactional
    @Override
    public int editOrder(TbOrder orders,String oid,String itemid, Integer count,Double subtotal) {
        int i = 0;
        try {
            //存放2张表,订单表和订单详情表
            //orders
            TbOrderExample example = new TbOrderExample();
            TbOrderExample.Criteria criteria = example.createCriteria();
//            criteria.andOidEqualTo(oid);
            i=ordersDao.updateByExampleSelective(orders,example);

            //ordersitem
//            Orderitem orderItem = new Orderitem();
//            orderItem.setCount(count);
//            orderItem.setSubtotal(subtotal);
//            OrderitemExample example1 = new OrderitemExample();
//            OrderitemExample.Criteria criteria1 = example1.createCriteria();
//            criteria1.andItemidEqualTo(itemid);
//            i += orderitemDao.updateByExampleSelective(orderItem,example1);
            //
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
}
