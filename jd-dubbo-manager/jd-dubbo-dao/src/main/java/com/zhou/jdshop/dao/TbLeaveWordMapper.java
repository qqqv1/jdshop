package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbLeaveWord;
import com.zhou.jdshop.pojo.po.TbLeaveWordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbLeaveWordMapper {
    int countByExample(TbLeaveWordExample example);

    int deleteByExample(TbLeaveWordExample example);

    int deleteByPrimaryKey(Long leaveWordId);

    int insert(TbLeaveWord record);

    int insertSelective(TbLeaveWord record);

    List<TbLeaveWord> selectByExample(TbLeaveWordExample example);

    TbLeaveWord selectByPrimaryKey(Long leaveWordId);

    int updateByExampleSelective(@Param("record") TbLeaveWord record, @Param("example") TbLeaveWordExample example);

    int updateByExample(@Param("record") TbLeaveWord record, @Param("example") TbLeaveWordExample example);

    int updateByPrimaryKeySelective(TbLeaveWord record);

    int updateByPrimaryKey(TbLeaveWord record);
}