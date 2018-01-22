package com.zhou.jdshop.pojo.po;

public class TbBrand {
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