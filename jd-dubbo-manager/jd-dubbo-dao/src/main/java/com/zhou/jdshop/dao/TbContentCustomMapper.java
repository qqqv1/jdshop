package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbContent;
import com.zhou.jdshop.pojo.po.TbContentExample;

import java.util.List;

public interface TbContentCustomMapper {

    List<TbContent> selectByCategoryId(TbContentExample example);
}