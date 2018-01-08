package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.Orders;
import com.zhou.jdshop.pojo.po.OrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersCustomMapper {
    /**
     * 查询所有订单
     * @param o
     * @return
     */
    List<Orders> selectByExample(Object o);
}