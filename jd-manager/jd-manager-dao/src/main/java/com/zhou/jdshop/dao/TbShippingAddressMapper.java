package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbShippingAddress;
import com.zhou.jdshop.pojo.po.TbShippingAddressExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbShippingAddressMapper {
    int countByExample(TbShippingAddressExample example);

    int deleteByExample(TbShippingAddressExample example);

    int deleteByPrimaryKey(Long aid);

    int insert(TbShippingAddress record);

    int insertSelective(TbShippingAddress record);

    List<TbShippingAddress> selectByExample(TbShippingAddressExample example);

    TbShippingAddress selectByPrimaryKey(Long aid);

    int updateByExampleSelective(@Param("record") TbShippingAddress record, @Param("example") TbShippingAddressExample example);

    int updateByExample(@Param("record") TbShippingAddress record, @Param("example") TbShippingAddressExample example);

    int updateByPrimaryKeySelective(TbShippingAddress record);

    int updateByPrimaryKey(TbShippingAddress record);
}