package com.zhou.jdshop.pojo.vo;

import com.zhou.jdshop.pojo.po.TbOrder;

public class OrdersCustom extends TbOrder {
    private String pname;

    private String itemid;
    private Integer count;
    private Double subtotal;


    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }


}
