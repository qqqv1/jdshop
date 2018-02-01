package com.zhou.jdshop.pojo.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * 购物车
 */
public class Cart {

    /**
     * 购物项
     */
    Map<Long,CartItem> items=new HashMap<Long, CartItem>();

    /**
     * 合计
     */
    private double total;

    public Map<Long, CartItem> getItems() {
        return items;
    }

    public void setItems(Map<Long, CartItem> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
