package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserCustomMapper {
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
