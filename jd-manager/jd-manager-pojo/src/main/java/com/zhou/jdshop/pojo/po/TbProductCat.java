package com.zhou.jdshop.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class TbProductCat implements Serializable {
    private Long cid;

    private Long parentId;

    private String cname;

    private Integer isParent;

    private Integer sortOrder;

    private Integer cflag;

    private Date created;

    private Date updated;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getCflag() {
        return cflag;
    }

    public void setCflag(Integer cflag) {
        this.cflag = cflag;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}