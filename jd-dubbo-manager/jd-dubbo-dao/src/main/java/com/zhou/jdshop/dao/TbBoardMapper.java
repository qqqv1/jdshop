package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbBoard;
import com.zhou.jdshop.pojo.po.TbBoardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBoardMapper {
    int countByExample(TbBoardExample example);

    int deleteByExample(TbBoardExample example);

    int deleteByPrimaryKey(Long boardId);

    int insert(TbBoard record);

    int insertSelective(TbBoard record);

    List<TbBoard> selectByExample(TbBoardExample example);

    TbBoard selectByPrimaryKey(Long boardId);

    int updateByExampleSelective(@Param("record") TbBoard record, @Param("example") TbBoardExample example);

    int updateByExample(@Param("record") TbBoard record, @Param("example") TbBoardExample example);

    int updateByPrimaryKeySelective(TbBoard record);

    int updateByPrimaryKey(TbBoard record);
}