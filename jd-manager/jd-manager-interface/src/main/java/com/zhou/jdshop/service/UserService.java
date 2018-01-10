package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.User;
import com.zhou.jdshop.pojo.po.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String uid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findUserByUsernameAndPassword(String username, String password);

    List<User> listUsers();

    User getUserById(String uid);

    int saveProduct(User user);

    int editUser(User user);

    int updateUser(List<String> uids, Integer state);
}
