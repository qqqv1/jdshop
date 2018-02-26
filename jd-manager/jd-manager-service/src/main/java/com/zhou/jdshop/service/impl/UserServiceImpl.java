package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbUserCustomMapper;
import com.zhou.jdshop.dao.TbUserMapper;
import com.zhou.jdshop.dto.MessageResult;
import com.zhou.jdshop.jedis.JedisClient;
import com.zhou.jdshop.pojo.po.TbUser;
import com.zhou.jdshop.pojo.po.TbUserExample;
import com.zhou.jdshop.service.UserService;
import com.zhou.jdshop.util.IDUtils;
import com.zhou.jdshop.util.JsonUtils;
import com.zhou.jdshop.util.StrKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbUserMapper userDao;

    @Autowired
    private TbUserCustomMapper userCustomDao;

    @Autowired
    private JedisClient jedisClient;

    @Override
    public MessageResult userLogin(String username, String password) {
        MessageResult mr = null;
        try {
            //使用查询模板查询用户
            TbUserExample example = new TbUserExample();
            TbUserExample.Criteria criteria = example.createCriteria();
            criteria.andUnameEqualTo(username);
            List<TbUser> userList = userDao.selectByExample(example);
            //若list为空，则用户名不存在
            if(userList == null || userList.isEmpty()){
                //用户名不存在
                mr = new MessageResult();
                mr.setSuccess(false);
                mr.setMessage("用户名不存在");
                return mr;
            }
            //用户名存在
            TbUser user = userList.get(0);
            //把前台传递过来的密码进行MD5的加密
            String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
            //前台传递过来的密码与后台密码比较，如果不相同就会进入判断
            if(!md5DigestAsHex.equals(user.getPassword())){
                //用户名正确但是密码错误
                mr = new MessageResult();
                mr.setSuccess(false);
                mr.setMessage("用户名或密码错误");
                return mr;
            }
            //用户名和密码都正确
            //第一步，把要自制的令牌存放到redis集群
            String token = StrKit.uuid();
            user.setPassword(null);
            //TT_TOKEN22222222,{"username":"","password":null,xxxxx}
            jedisClient.set("TT_TOKEN:" + token, JsonUtils.objectToJson(user));
            //第二步，设置过期时间
            jedisClient.expire("TT_TOKEN:" + token,1800);
            //第三步，设置返回值
            mr = new MessageResult();
            mr.setSuccess(true);
            mr.setMessage("登录成功");
            mr.setData(token);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return mr;
    }

    @Override
    public List<TbUser> listUsers() {
        List<TbUser> list = new ArrayList<>();
        try {
            TbUserExample example=new TbUserExample();
            TbUserExample.Criteria criteria = example.createCriteria();
            criteria.andStateNotEqualTo(0);
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
    public int saveProduct(TbUser user) {
        int i = 0;
        try {
            Long uid = IDUtils.getItemId();
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
    public int updateUser(List<Long> uids, Integer state) {
        int i = 0;
        try {
            TbUser user =new TbUser();
            user.setState(state);
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

    public int updateUserByState(List<Long> uids,Integer state) {
        int i = 0;
        try {
            TbUser user =new TbUser();
            user.setState(state);
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
}
