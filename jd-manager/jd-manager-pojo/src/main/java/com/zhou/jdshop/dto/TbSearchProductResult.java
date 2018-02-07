package com.zhou.jdshop.dto;

import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.vo.TbProductCustom;

import java.util.List;

public class TbSearchProductResult extends TbProduct {

    private long recordCount;
    private int totalPages;
    private List<TbProductCustom> itemList;

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

    public List<TbProductCustom> getItemList() {
        return itemList;
    }

    public void setItemList(List<TbProductCustom> itemList) {
        this.itemList = itemList;
    }
}
