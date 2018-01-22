package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbNew;
import com.zhou.jdshop.pojo.po.TbNewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNewMapper {
    int countByExample(TbNewExample example);

    int deleteByExample(TbNewExample example);

    int deleteByPrimaryKey(Long newId);

    int insert(TbNew record);

    int insertSelective(TbNew record);

    List<TbNew> selectByExample(TbNewExample example);

    TbNew selectByPrimaryKey(Long newId);

    int updateByExampleSelective(@Param("record") TbNew record, @Param("example") TbNewExample example);

    int updateByExample(@Param("record") TbNew record, @Param("example") TbNewExample example);

    int updateByPrimaryKeySelective(TbNew record);

    int updateByPrimaryKey(TbNew record);
}