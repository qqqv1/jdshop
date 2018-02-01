package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbProductCatParam;
import com.zhou.jdshop.pojo.po.TbProductCatParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProductCatParamMapper {
    int countByExample(TbProductCatParamExample example);

    int deleteByExample(TbProductCatParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProductCatParam record);

    int insertSelective(TbProductCatParam record);

    List<TbProductCatParam> selectByExampleWithBLOBs(TbProductCatParamExample example);

    List<TbProductCatParam> selectByExample(TbProductCatParamExample example);

    TbProductCatParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProductCatParam record, @Param("example") TbProductCatParamExample example);

    int updateByExampleWithBLOBs(@Param("record") TbProductCatParam record, @Param("example") TbProductCatParamExample example);

    int updateByExample(@Param("record") TbProductCatParam record, @Param("example") TbProductCatParamExample example);

    int updateByPrimaryKeySelective(TbProductCatParam record);

    int updateByPrimaryKeyWithBLOBs(TbProductCatParam record);

    int updateByPrimaryKey(TbProductCatParam record);
}