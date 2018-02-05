package com.zhou.jdshop.pojo.vo;

import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.po.TbOrderItem;
import com.zhou.jdshop.pojo.po.TbOrderShipping;

import java.io.Serializable;
import java.util.List;
//TbOrder ,TbOrderItem, TbOrderShipping合在一个pojo
public class OrderInfo extends TbOrder implements Serializable{

    private List<TbOrderItem> orderItems;

    private TbOrderShipping orderShipping;

    public List<TbOrderItem> getOrderItems(){
        return orderItems;
    }
    public void setOrderItems(List<TbOrderItem> orderItems){
        this.orderItems = orderItems;
    }
    public TbOrderShipping getOrderShipping() {
        return orderShipping;
    }

    public void setOrderShipping(TbOrderShipping orderShipping){
        this.orderShipping = orderShipping;
    }
}
