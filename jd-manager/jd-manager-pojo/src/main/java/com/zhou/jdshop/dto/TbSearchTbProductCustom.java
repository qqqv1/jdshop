package com.zhou.jdshop.dto;

import com.zhou.jdshop.pojo.po.TbProduct;

public class TbSearchTbProductCustom extends TbProduct {
    private String cname;
    private String id;
    private String price;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
