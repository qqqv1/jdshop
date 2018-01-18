package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.UserCustomMapper;
import com.zhou.jdshop.dao.UserMapper;
import com.zhou.jdshop.pojo.po.User;
import com.zhou.jdshop.pojo.po.UserExample;
import com.zhou.jdshop.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userDao;

    @Autowired
    private UserCustomMapper userCustomDao;

    @Override
    public List<User> listUsers() {
        List<User> list = new ArrayList<>();
        try {
            UserExample example=new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andStateNotEqualTo(0);
            list=userDao.selectByExample(example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public User getUserById(String uid) {
        User user=new User();
        try {
            UserExample example=new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andUidEqualTo(uid);
            criteria.andStateNotEqualTo(0);
            user = userDao.selectByExample(example).get(0);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return user;
    }

    @Transactional
    @Override
    public int saveProduct(User user) {
        int i = 0;
        try {
            String uid = UUID.randomUUID().toString().replaceAll("-","");
            user.setUid(uid);
            user.setState(1);
            i = userDao.insert(user);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Transactional
    @Override
    public int editUser(User user) {
        int i = 0;
        try {
            UserExample example=new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andUidEqualTo(user.getUid());
            i = userDao.updateByExampleSelective(user,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int updateUser(List<String> uids, Integer state) {
        int i = 0;
        try {
             User user =new User();
            user.setState(state);
            UserExample example=new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andUidIn(uids);
            i = userDao.updateByExampleSelective(user,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /*
     * 登陆
     */
    public User findUserByUsernameAndPassword(String username,String password){

        return userCustomDao.selectByUsernameAndPassword(username,password);
    }

    @Override
    public int insertUser(User user) {

        return userCustomDao.insertUser(user);
    }
    @Override
    public int insertGUIDUser(User user) {
        UUID uuid = null;
        try {
            uuid = UUID.randomUUID();
            System.err.println(uuid);
            user.setUid(uuid.toString());
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return userCustomDao.insertUser(user);
    }

    @Override
    public int updateByUser(User user) {
        return userCustomDao.updateByUser(user);
    }

    @Override
    public List<User> selectByDim(User user) {
        return userCustomDao.selectByDim(user);
    }

    @Override
    public int deleteByUser(User user) {
        return userCustomDao.deleteByUser(user);
    }

    @Override
    public List<User> selectAll() {
        return userCustomDao.selectAll();
    }

    public int updateUserByState(List<String> uids,Integer state) {
        int i = 0;
        try {
            User user =new User();
            user.setState(state);
            UserExample example=new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andUidIn(uids);
            i = userDao.updateByExampleSelective(user,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
    public User findByUsername(String username){
        return userCustomDao.selectByUsername(username);
    }
}
