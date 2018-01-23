package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserCustomMapper {
    TbUser selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    int insertUser(TbUser user);

    int updateByUser(TbUser user);

    List<TbUser> selectByDim(TbUser user);

    int deleteByUser(TbUser user);

    List<TbUser> selectAll();

    TbUser selectByUsername(String username);
}
