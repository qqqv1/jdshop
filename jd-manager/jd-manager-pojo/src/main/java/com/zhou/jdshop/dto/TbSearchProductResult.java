package com.zhou.jdshop.dto;

import java.util.List;

public class TbSearchProductResult {
    private long recordCount;
    private int totalPages;
    private List<TbSearchTbProductCustom> itemList;

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<TbSearchTbProductCustom> getItemList() {
        return itemList;
    }

    public void setItemList(List<TbSearchTbProductCustom> itemList) {
        this.itemList = itemList;
    }
}
