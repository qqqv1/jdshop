package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.User;
import com.zhou.jdshop.pojo.po.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    int insertUser(User user);

    int insertGUIDUser(User user);

    int updateByUser(User user);

    List<User> selectByDim(User user);

    int deleteByUser(User user);

    List<User> selectAll();

    int updateUserByState(List<String> uids, Integer state);

    User findByUsername(String username);

    User findUserByUsernameAndPassword(String username, String password);

    List<User> listUsers();

    User getUserById(String uid);

    int saveProduct(User user);

    int editUser(User user);

    int updateUser(List<String> uids, Integer state);
}
