package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.vo.TbOrdersCustom;

import java.util.List;

public interface TbOrdersCustomMapper {
    /**
     * 查询所有订单
     * @param o
     * @return
     */
    List<TbOrder> selectByExample(Object o);

    /**
     * 根据itemi查订单
     * @param id
     * @return
     */
    TbOrdersCustom selectOrderById(String id);
}