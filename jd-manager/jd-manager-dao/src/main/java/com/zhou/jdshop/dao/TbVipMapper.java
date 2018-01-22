package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbVip;
import com.zhou.jdshop.pojo.po.TbVipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbVipMapper {
    int countByExample(TbVipExample example);

    int deleteByExample(TbVipExample example);

    int insert(TbVip record);

    int insertSelective(TbVip record);

    List<TbVip> selectByExample(TbVipExample example);

    int updateByExampleSelective(@Param("record") TbVip record, @Param("example") TbVipExample example);

    int updateByExample(@Param("record") TbVip record, @Param("example") TbVipExample example);
}