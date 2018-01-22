package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbProductCat;
import com.zhou.jdshop.pojo.po.TbProductCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductCatMapper {
    int countByExample(TbProductCatExample example);

    int deleteByExample(TbProductCatExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(TbProductCat record);

    int insertSelective(TbProductCat record);

    List<TbProductCat> selectByExample(TbProductCatExample example);

    TbProductCat selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") TbProductCat record, @Param("example") TbProductCatExample example);

    int updateByExample(@Param("record") TbProductCat record, @Param("example") TbProductCatExample example);

    int updateByPrimaryKeySelective(TbProductCat record);

    int updateByPrimaryKey(TbProductCat record);
}