package com.zhou.jdshop.dubbo.service;

import com.zhou.jdshop.pojo.po.TbUser;

import java.util.List;

public interface UserService {

    int insertUser(TbUser user);

    int insertGUIDUser(TbUser user);

    int updateByUser(TbUser user);

    List<TbUser> selectByDim(TbUser user);

    int deleteByUser(TbUser user);

    List<TbUser> selectAll();

    int updateUserByState(List<Long> uids, Integer state);

    TbUser findByUsername(String username);

    TbUser findUserByUsernameAndPassword(String username, String password);

    List<TbUser> listUsers();

    TbUser getUserById(Long uid);

    int saveProduct(TbUser user);

    int editUser(TbUser user);

    int updateUser(List<Long> uids, Integer state);
}
