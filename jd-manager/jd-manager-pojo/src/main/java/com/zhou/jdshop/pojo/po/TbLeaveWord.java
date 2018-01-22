package com.zhou.jdshop.pojo.po;

import java.util.Date;

public class TbLeaveWord {
    private Long leaveWordId;

    private Long uid;

    private String caption;

    private String content;

    private Date time;

    private Integer replies;

    private Integer views;

    private String finalReply;

    private Boolean whetherTop;

    private Boolean whetherElite;

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

    public Boolean getWhetherTop() {
        return whetherTop;
    }

    public void setWhetherTop(Boolean whetherTop) {
        this.whetherTop = whetherTop;
    }

    public Boolean getWhetherElite() {
        return whetherElite;
    }

    public void setWhetherElite(Boolean whetherElite) {
        this.whetherElite = whetherElite;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }
}