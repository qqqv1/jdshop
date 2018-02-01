package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbAdministrator;
import com.zhou.jdshop.pojo.po.TbAdministratorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAdministratorMapper {
    int countByExample(TbAdministratorExample example);

    int deleteByExample(TbAdministratorExample example);

    int deleteByPrimaryKey(Long adminId);

    int insert(TbAdministrator record);

    int insertSelective(TbAdministrator record);

    List<TbAdministrator> selectByExample(TbAdministratorExample example);

    TbAdministrator selectByPrimaryKey(Long adminId);

    int updateByExampleSelective(@Param("record") TbAdministrator record, @Param("example") TbAdministratorExample example);

    int updateByExample(@Param("record") TbAdministrator record, @Param("example") TbAdministratorExample example);

    int updateByPrimaryKeySelective(TbAdministrator record);

    int updateByPrimaryKey(TbAdministrator record);
}