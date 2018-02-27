package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbUserCustomMapper;
import com.zhou.jdshop.dao.TbUserMapper;
import com.zhou.jdshop.pojo.po.TbUser;
import com.zhou.jdshop.pojo.po.TbUserExample;
import com.zhou.jdshop.service.UserService;
import com.zhou.jdshop.util.IDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbUserMapper userDao;

    @Autowired
    private TbUserCustomMapper userCustomDao;

    @Override
    public List<TbUser> listUsers() {
        List<TbUser> list = new ArrayList<>();
        try {
            TbUserExample example=new TbUserExample();
            TbUserExample.Criteria criteria = example.createCriteria();
            criteria.andStatusNotEqualTo("delete");
            list=userDao.selectByExample(example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public TbUser getUserById(Long uid) {
        TbUser user=new TbUser();
        try {
            TbUserExample example=new TbUserExample();
            TbUserExample.Criteria criteria = example.createCriteria();
            criteria.andUidEqualTo(uid);
            criteria.andStatusNotEqualTo("delete");
            user = userDao.selectByExample(example).get(0);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return user;
    }

    @Transactional
    @Override
    public int saveUser(TbUser user) {
        int i = 0;
        try {
            Long uid = IDUtils.getItemId();
            user.setUid(uid);
            i = userDao.insert(user);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Transactional
    @Override
    public int editUser(TbUser user) {
        int i = 0;
        try {
            TbUserExample example=new TbUserExample();
            TbUserExample.Criteria criteria = example.createCriteria();
            criteria.andUidEqualTo(user.getUid());
            i = userDao.updateByExampleSelective(user,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int updateUser(List<Long> uids, String state) {
        int i = 0;
        try {
            TbUser user =new TbUser();
            user.setStatus(state);
            TbUserExample example=new TbUserExample();
            TbUserExample.Criteria criteria = example.createCriteria();
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
    public TbUser findUserByUsernameAndPassword(String username,String password){

        return userCustomDao.selectByUsernameAndPassword(username,password);
    }

    @Override
    public int insertUser(TbUser user) {

        return userCustomDao.insertUser(user);
    }
    @Override
    public int insertGUIDUser(TbUser user) {
        try {
            Long uid=IDUtils.getItemId();
            user.setUid(uid);
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return userCustomDao.insertUser(user);
    }

    @Override
    public int updateByUser(TbUser user) {
        return userCustomDao.updateByUser(user);
    }

    @Override
    public List<TbUser> selectByDim(TbUser user) {
        return userCustomDao.selectByDim(user);
    }

    @Override
    public int deleteByUser(TbUser user) {
        return userCustomDao.deleteByUser(user);
    }

    @Override
    public List<TbUser> selectAll() {
        return userCustomDao.selectAll();
    }

    public int updateUserByState(List<Long> uids,String state) {
        int i = 0;
        try {
            TbUser user =new TbUser();
            user.setStatus(state);
            TbUserExample example=new TbUserExample();
            TbUserExample.Criteria criteria = example.createCriteria();
            criteria.andUidIn(uids);
            i = userDao.updateByExampleSelective(user,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
    public TbUser findByUsername(String username){
        return userCustomDao.selectByUsername(username);
    }

    @Override
    public TbUser getUserByAccount(String account) {
        TbUserExample example=new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("active");
        criteria.andAccountEqualTo(account);
        return userDao.selectByExample(example).get(0);
    }
}
