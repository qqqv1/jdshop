package com.zhou.jdshop.pojo.po;

public class TbBoard {
    private Long boardId;

    private String boardName;

    private String boardModerator;

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }

    public String getBoardModerator() {
        return boardModerator;
    }

    public void setBoardModerator(String boardModerator) {
        this.boardModerator = boardModerator == null ? null : boardModerator.trim();
    }
}