package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.vo.OrdersCustom;

import java.util.List;

public interface OrdersCustomMapper {
    /**
     * 查询所有订单
     * @param o
     * @return
     */
    List<TbOrder> selectByExample(Object o);

    /**
     * 根据itemi查订单
     * @param itemid
     * @return
     */
    OrdersCustom selectOrderById(String itemid);
}