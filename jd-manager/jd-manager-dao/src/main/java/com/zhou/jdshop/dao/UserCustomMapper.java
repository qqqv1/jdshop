package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCustomMapper {
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    int insertUser(User user);

    int updateByUser(User user);

    List<User> selectByDim(User user);

    int deleteByUser(User user);

    List<User> selectAll();

    User selectByUsername(String username);
}
