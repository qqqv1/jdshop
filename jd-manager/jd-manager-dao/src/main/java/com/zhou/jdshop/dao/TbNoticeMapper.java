package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbNotice;
import com.zhou.jdshop.pojo.po.TbNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoticeMapper {
    int countByExample(TbNoticeExample example);

    int deleteByExample(TbNoticeExample example);

    int deleteByPrimaryKey(Long noticeId);

    int insert(TbNotice record);

    int insertSelective(TbNotice record);

    List<TbNotice> selectByExample(TbNoticeExample example);

    TbNotice selectByPrimaryKey(Long noticeId);

    int updateByExampleSelective(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByExample(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByPrimaryKeySelective(TbNotice record);

    int updateByPrimaryKey(TbNotice record);
}