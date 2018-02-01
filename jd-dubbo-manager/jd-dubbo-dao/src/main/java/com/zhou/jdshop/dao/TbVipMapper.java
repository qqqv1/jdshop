package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbVip;
import com.zhou.jdshop.pojo.po.TbVipExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbVipMapper {
    int countByExample(TbVipExample example);

    int deleteByExample(TbVipExample example);

    int deleteByPrimaryKey(Integer userLevel);

    int insert(TbVip record);

    int insertSelective(TbVip record);

    List<TbVip> selectByExample(TbVipExample example);

    TbVip selectByPrimaryKey(Integer userLevel);

    int updateByExampleSelective(@Param("record") TbVip record, @Param("example") TbVipExample example);

    int updateByExample(@Param("record") TbVip record, @Param("example") TbVipExample example);

    int updateByPrimaryKeySelective(TbVip record);

    int updateByPrimaryKey(TbVip record);
}