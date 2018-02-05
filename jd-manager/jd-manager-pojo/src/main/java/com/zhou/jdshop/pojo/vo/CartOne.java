package com.zhou.jdshop.pojo.vo;

import java.io.Serializable;

public class CartOne implements Serializable {
    private double subTotal;
    private double total;
    private int count;

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
