package com.zhou.jdshop.pojo.vo;

import com.zhou.jdshop.pojo.po.TbProduct;

/**
 * 购物项
 */
public class CartItem {
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


    public TbProduct getTbProduct() {
        return product;
    }

    public void setTbProduct(TbProduct product) {
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
