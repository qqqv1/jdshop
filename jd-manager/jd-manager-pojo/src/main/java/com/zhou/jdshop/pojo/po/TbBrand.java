package com.zhou.jdshop.pojo.po;

import java.io.Serializable;

public class TbBrand implements Serializable {
    private Long bid;

    private String bname;

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }
}