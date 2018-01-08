package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.Orders;

import java.util.List;

public interface OrderService {

    /**
     * 查询所有订单
     * @return
     */
    List<Orders> listOrders();
}
