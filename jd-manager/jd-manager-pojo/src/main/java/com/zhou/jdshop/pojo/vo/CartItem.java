package com.zhou.jdshop.pojo.vo;

import com.zhou.jdshop.pojo.po.TbProduct;

import java.io.Serializable;

/**
 * 购物项
 */
public class CartItem implements Serializable {
    /**
     * 商品
     */
    private TbProduct product;
    /**
     * 购买数量
     */
    private int count;
    /**
     * 小计
     */
    private double subTotal;


    public TbProduct getProduct() {
        return product;
    }

    public void setProduct(TbProduct product) {
        this.product=product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
