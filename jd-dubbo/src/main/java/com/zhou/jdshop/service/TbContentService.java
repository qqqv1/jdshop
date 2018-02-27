package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.TbContent;

import java.util.List;

public interface TbContentService {
    List<TbContent> getContentListByCid(Long cid);
}
