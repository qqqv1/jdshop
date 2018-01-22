package com.zhou.jdshop.pojo.po;

public class TbShippingAddress {
    private Long aid;

    private String shippingAddr;

    private Integer zipCode;

    private String receiverPhone;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getShippingAddr() {
        return shippingAddr;
    }

    public void setShippingAddr(String shippingAddr) {
        this.shippingAddr = shippingAddr == null ? null : shippingAddr.trim();
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }
}