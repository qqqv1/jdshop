package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.OrdersCustomMapper;
import com.zhou.jdshop.dao.OrdersMapper;
import com.zhou.jdshop.pojo.po.Orders;
import com.zhou.jdshop.pojo.po.OrdersExample;
import com.zhou.jdshop.pojo.vo.OrdersCustom;
import com.zhou.jdshop.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OrdersMapper ordersDao;

    @Autowired
    private OrdersCustomMapper ordersCustomDao;

    /**
     * 查询所有订单
     * @return
     */
    @Override
    public List<Orders> listOrders() {
        List<Orders> list=null;
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
            Orders order =new Orders();
            order.setState(0);
            OrdersExample example = new OrdersExample();
            OrdersExample.Criteria criteria = example.createCriteria();
            criteria.andOidIn(oids);
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

    @Override
    public int editOrder(OrdersCustom ordersCustom) {
        return 0;
    }
}
