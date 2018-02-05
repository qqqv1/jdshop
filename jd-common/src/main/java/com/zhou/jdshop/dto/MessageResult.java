package com.zhou.jdshop.dto;

import java.io.Serializable;

public class MessageResult implements Serializable {
    //是否成功
    private boolean success;
    //文本
    private String message;
//    返回的数据
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
