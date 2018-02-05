package com.zhou.jdshop.pojo.po;

import java.io.Serializable;

public class TbAdministrator implements Serializable {
    private Long adminId;

    private String adminName;

    private String adminPassword;

    private Integer adminAuthority;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Integer getAdminAuthority() {
        return adminAuthority;
    }

    public void setAdminAuthority(Integer adminAuthority) {
        this.adminAuthority = adminAuthority;
    }
}