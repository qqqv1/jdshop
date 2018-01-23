package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.vo.TbOrdersCustom;

import java.util.List;

public interface OrderService {

    /**
     * 查询所有订单
     * @return
     */
    List<TbOrder> listOrders();

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

    TbOrdersCustom getOrderById(String itemid);

    /**
     * 修改订单
     * @param
     * @return
     */
    int editOrder(TbOrder orders,String oid,String itemid, Integer count,Double subtotal);
}
