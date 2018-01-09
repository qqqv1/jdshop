package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.Orders;
import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.pojo.vo.OrdersCustom;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderService {

    /**
     * 查询所有订单
     * @return
     */
    List<Orders> listOrders();

    /**
     * 删除选中的订单
     * @param oids
     * @return
     */
    int deleteOrders(List<String> oids);

    /**
     * 根据ID查询订单
     * @param itemid
     * @return
     */

    OrdersCustom getOrderById(String itemid);

    /**
     * 修改订单
     * @param
     * @return
     */
    int editOrder(Orders orders,String oid,String itemid, Integer count,Double subtotal);
}
