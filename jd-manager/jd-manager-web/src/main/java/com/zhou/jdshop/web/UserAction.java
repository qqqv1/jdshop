package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.TbUser;
import com.zhou.jdshop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService us;

    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<TbUser> listUsers() {

        List<TbUser> list=null;
        try {
            list = us.listUsers();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/user/{uid}", method = RequestMethod.GET)
    public TbUser getItemById(@PathVariable("uid") Long uid) {
        return us.getUserById(uid);
    }

    @ResponseBody
    @RequestMapping("/addUser")
    public int saveProduct(TbUser user){
        int i = 0;
        try {
            i = us.saveProduct(user);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/editUser")
    public int editProduct(TbUser user){
        int i = 0;
        try {
            i = us.editUser(user);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/updateUser")
    public int deleteProduct(@RequestParam("uids[]") List<Long> uids, @RequestParam("state") Integer state){
        int i = 0;
        try {
            i = us.updateUser(uids,state);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/userLogin")
    public int userLogin(HttpSession session, String username, String password){
        int flag=0;
        TbUser user= us.findUserByUsernameAndPassword(username,password);
        session.setAttribute("sessionUser",user);
        if(user!=null){
            flag=1;
        }
        return flag;
    }

    @ResponseBody
    @RequestMapping("/logout")
    public int logout(HttpSession session){
        int flag=0;
        session.removeAttribute("sessionUser");
        if (session.getAttribute("sessionUser")==null){
            flag=1;
        }
        return flag;
    }
}
