package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.Orders;
import com.zhou.jdshop.pojo.po.OrdersExample;
import com.zhou.jdshop.pojo.vo.OrdersCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersCustomMapper {
    /**
     * 查询所有订单
     * @param o
     * @return
     */
    List<Orders> selectByExample(Object o);

    /**
     * 根据itemi查订单
     * @param itemid
     * @return
     */
    OrdersCustom selectOrderById(String itemid);
}