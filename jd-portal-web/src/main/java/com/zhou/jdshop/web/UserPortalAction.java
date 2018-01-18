package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.User;
import com.zhou.jdshop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserPortalAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService us;

    /**
     *  用户登录 注册 个人信息
     */

    /**
     *  用户注册(邮箱)
     */
    @ResponseBody
    @RequestMapping(value="/insertUserByEmail",method =RequestMethod.POST)
    public int insertUserByEmail(User user){
        System.err.println(user.toString());
        int list = 0;
        try {
            list = us.insertGUIDUser(user);
            System.err.println(list);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }
    /**
     *  用户注册（手机号）
     */
    @ResponseBody
    @RequestMapping(value="/insertUserByTelephone",method = RequestMethod.POST)
    public int insertUserByTelephone(User user){
        int list = 0;
        try {
            list = us.insertGUIDUser(user);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }
    /**
     *  用户登录
     */
    @ResponseBody
    @RequestMapping(value ="/clientLogin",method = RequestMethod.POST)
    public int userUserLogin(HttpSession session, String username, String password){
        int flag=0;
        User user= us.findUserByUsernameAndPassword(username,password);
        if(user!=null){
            session.setAttribute("sessionUser",user);
            flag=1;
        }
        return flag;
    }
    /**
     *  用户个人信息查询
     */
    @ResponseBody
    @RequestMapping("/findByUserName")
    public int findByUserName(User user){
        int flag=0;
        User user1= us.findByUsername(user.getUsername());
        if(user1!=null){
            flag=1;
        }
        return flag;
    }

    /**
     * 用户：修改用户
     */
    @ResponseBody
    @RequestMapping("/updateUserByInformation")
    public int updateUserByInformation(HttpSession session,User user){
        int i = 0;
        User u = null;
        try {
            i = us.updateByUser(user);
            u = us.findByUsername(user.getUsername());
            session.setAttribute("User",user);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

}
