package com.zhou.jdshop.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class TbLeaveWord implements Serializable {
    private Long leaveWordId;

    private Long uid;

    private String caption;

    private String content;

    private Date time;

    private Integer replies;

    private Integer views;

    private String finalReply;

    private Integer whetherTop;

    private Integer whetherElite;

    private String boardName;

    public Long getLeaveWordId() {
        return leaveWordId;
    }

    public void setLeaveWordId(Long leaveWordId) {
        this.leaveWordId = leaveWordId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getReplies() {
        return replies;
    }

    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getFinalReply() {
        return finalReply;
    }

    public void setFinalReply(String finalReply) {
        this.finalReply = finalReply == null ? null : finalReply.trim();
    }

    public Integer getWhetherTop() {
        return whetherTop;
    }

    public void setWhetherTop(Integer whetherTop) {
        this.whetherTop = whetherTop;
    }

    public Integer getWhetherElite() {
        return whetherElite;
    }

    public void setWhetherElite(Integer whetherElite) {
        this.whetherElite = whetherElite;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }
}