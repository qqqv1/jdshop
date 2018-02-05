package com.zhou.jdshop.pojo.vo;

import com.zhou.jdshop.pojo.po.TbProduct;

import java.io.Serializable;

public class TbProductCustom extends TbProduct implements Serializable {
    private String cname;
    private String bname;
    private String hname;

    //为了做全文检索加了下面3个字段
    private String id;//本质是pid
    private Long price;//本质是shopPrice

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}
