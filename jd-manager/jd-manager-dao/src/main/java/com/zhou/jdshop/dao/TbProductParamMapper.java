package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbProductParam;
import com.zhou.jdshop.pojo.po.TbProductParamExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbProductParamMapper {
    int countByExample(TbProductParamExample example);

    int deleteByExample(TbProductParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProductParam record);

    int insertSelective(TbProductParam record);

    List<TbProductParam> selectByExampleWithBLOBs(TbProductParamExample example);

    List<TbProductParam> selectByExample(TbProductParamExample example);

    TbProductParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProductParam record, @Param("example") TbProductParamExample example);

    int updateByExampleWithBLOBs(@Param("record") TbProductParam record, @Param("example") TbProductParamExample example);

    int updateByExample(@Param("record") TbProductParam record, @Param("example") TbProductParamExample example);

    int updateByPrimaryKeySelective(TbProductParam record);

    int updateByPrimaryKeyWithBLOBs(TbProductParam record);

    int updateByPrimaryKey(TbProductParam record);
}