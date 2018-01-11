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
    private UserMapper usermapper;

    @Autowired
    private UserCustomMapper userCustomDao;

    @Override
    public List<User> listUsers() {
        List<User> list = new ArrayList<>();
        try {
            UserExample example=new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andStateNotEqualTo(0);
            list=usermapper.selectByExample(example);
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
            user = usermapper.selectByExample(example).get(0);
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
            i = usermapper.insert(user);
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
            i = usermapper.updateByExampleSelective(user,example);
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
            i = usermapper.updateByExampleSelective(user,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /*
              * 根据用户查询用户数量
              */
    public int countByExample(UserExample example) {
        int cbe = 0;
        try {
            cbe = usermapper.countByExample(example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }

        return cbe;
    }

    /*
     * 根据用户删除用户
     */
    public int deleteByExample(UserExample example) {

        int dbe = 0;
        try {
            dbe = usermapper.deleteByExample(example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }

        return dbe;
    }

    /*
     * 根据用户id删除用户
     */
    public int deleteByPrimaryKey(String uid){

        int dbp = 0;
        try {
            dbp = usermapper.deleteByPrimaryKey(uid);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return dbp;
    }

    /*
     * 插入数量
     */
    public int insert(User record) {

        int ist = 0;
        try {
            ist = usermapper.insert(record);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ist;
    }

    /*
     * ...数量
     */
    public int insertSelective(User record) {

        int ist = 0;
        try {
            ist = usermapper.insertSelective(record);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ist;
    }

    /*
     * 查询用户
     */
    public List<User> selectByExample(UserExample example) {

        List<User> sbe = null;
        try {
            sbe = usermapper.selectByExample(example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return sbe;
    }

    /*
     * 根据id查询用户
     */
    public User selectByPrimaryKey(String uid) {
        User user = null;
        try {
            user = usermapper.selectByPrimaryKey(uid);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return user;
    }

    /*
     * 查询...的数量
     */
    public int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) {

        int ube = 0;
        try {
            ube = usermapper.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ube;
    }

    /*
     * 查询...的数量
     */
    public int updateByExample(@Param("record") User record, @Param("example") UserExample example) {
        int ude = 0;
        try {
            ude = usermapper.updateByExample(record, example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ude;
    }

    /*
     * 查询...的数量
     */
    public int updateByPrimaryKeySelective(User record) {

        int ups = 0;
        try {
            ups = usermapper.updateByPrimaryKeySelective(record);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ups;
    }

    /*
     * 查询...的数量
     */
    public int updateByPrimaryKey(User record) {

        int ubp = 0;
        try {
            ubp = usermapper.updateByPrimaryKey(record);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ubp;
    }
    /*
     * 登陆
     */
    public User findUserByUsernameAndPassword(String username,String password){

        return userCustomDao.selectByUsernameAndPassword(username,password);
    }
}
