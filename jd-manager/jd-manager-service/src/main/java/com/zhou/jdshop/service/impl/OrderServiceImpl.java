package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.OrdersCustomMapper;
import com.zhou.jdshop.dao.OrdersMapper;
import com.zhou.jdshop.pojo.po.Orders;
import com.zhou.jdshop.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
}
