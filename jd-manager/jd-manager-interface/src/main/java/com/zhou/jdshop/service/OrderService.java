package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.po.TbOrderItem;
import com.zhou.jdshop.pojo.vo.TbOrdersCustom;

import java.util.List;

public interface OrderService extends  OrderManagerService{

    /**
     * 查询所有订单
     *
     * @return
     */
    List<TbOrder> listOrders();

    /**
     * 删除选中的订单
     *
     * @param ids
     * @return
     */
    int deleteOrderItems(List<String> ids);

    /**
     * 根据ID查询订单
     *
     * @param id
     * @return
     */
    TbOrdersCustom getOrderById(String id);

    /**
     * 修改订单
     *
     * @param
     * @return
     */
    int editOrder(String title, String id, String orderId, String num, String totalFee, String receiverName, String receiverMobile, String receiverAddress);
}