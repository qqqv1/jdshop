package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.po.TbProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductMapper {
    int countByExample(TbProductExample example);

    int deleteByExample(TbProductExample example);

    int insert(TbProduct record);

    int insertSelective(TbProduct record);

    List<TbProduct> selectByExample(TbProductExample example);

    int updateByExampleSelective(@Param("record") TbProduct record, @Param("example") TbProductExample example);

    int updateByExample(@Param("record") TbProduct record, @Param("example") TbProductExample example);
}