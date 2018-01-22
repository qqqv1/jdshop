package com.zhou.jdshop.pojo.po;

public class TbVip {
    private Integer userLevel;

    private Double userDiscount;

    private Integer upLimit;

    private Integer downLimit;

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Double getUserDiscount() {
        return userDiscount;
    }

    public void setUserDiscount(Double userDiscount) {
        this.userDiscount = userDiscount;
    }

    public Integer getUpLimit() {
        return upLimit;
    }

    public void setUpLimit(Integer upLimit) {
        this.upLimit = upLimit;
    }

    public Integer getDownLimit() {
        return downLimit;
    }

    public void setDownLimit(Integer downLimit) {
        this.downLimit = downLimit;
    }
}