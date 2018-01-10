package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.User;
import com.zhou.jdshop.pojo.po.UserExample;
import com.zhou.jdshop.service.UserService;
import org.apache.ibatis.annotations.Param;
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
    public List<User> listUsers() {

        List<User> list=null;
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
    public User getItemById(@PathVariable("uid") String uid) {
        return us.getUserById(uid);
    }

    @ResponseBody
    @RequestMapping("/addUser")
    public int saveProduct(User user){
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
    public int editProduct(User user){
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
    public int deleteProduct(@RequestParam("uids[]") List<String> uids, @RequestParam("state") Integer state){
        int i = 0;
        try {
            i = us.updateUser(uids,state);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /*
     * 根据用户查询用户数量
     */
   @ResponseBody
   @RequestMapping(value = "/selectUserByUser",method = RequestMethod.GET)
    public int countByExample(UserExample example) {

        int cbe = 0;
        try {
            cbe = us.countByExample(example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return cbe;
    }

    /*
     * 根据用户删除用户
     */
    @ResponseBody
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public int deleteByExample(UserExample example) {

        int dbe = 0;
        try {
            dbe = us.deleteByExample(example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return dbe;
    }

    /*
     * 根据id删除
     */
    @ResponseBody
    @RequestMapping(value = "/deleteUserById",method = RequestMethod.GET)
    public int deleteByPrimaryKey(String uid) {

        int dbp = 0;
        try {
            dbp = us.deleteByPrimaryKey(uid);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return dbp;
    }

    /*
     * ...数量
     */
    @ResponseBody
    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public int insert(User record) {

        int ins = 0;
        try {
            ins = us.insert(record);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return ins;
    }

    /*
     * ...数量
     */
    @ResponseBody
    @RequestMapping(value = "/insertSelectUser",method = RequestMethod.POST)
    public int insertSelective(User record) {

        int ist = 0;
        try {
            ist = us.insertSelective(record);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return ist;
    }

    /*
     * 查询用户
     */
    @ResponseBody
    @RequestMapping(value = "/selectUserByUserE",method = RequestMethod.POST)
    public List<User> selectByExample(UserExample example) {

        List<User> sbe = null;
        try {
            sbe = us.selectByExample(example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return sbe;
    }
    /*
     * 查询用户
     */
    @ResponseBody
    @RequestMapping(value = "/selectUserByUid",method = RequestMethod.POST)
    public User selectByPrimaryKey(String uid) {

        User sbp = null;
        try {
            sbp = us.selectByPrimaryKey(uid);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return sbp;
    }

    /*
     * 查询...的数量
     */
    @ResponseBody
    @RequestMapping(value = "/updateByESt",method = RequestMethod.POST)
    public int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) {


        int ubs = 0;
        try {
            ubs = us.updateByExampleSelective(record, example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return ubs;
    }
    /*
     * 查询...的数量
     */
    @ResponseBody
    @RequestMapping(value = "/updateByExa",method = RequestMethod.POST)
    public int updateByExample(@Param("record") User record, @Param("example") UserExample example){

        int ube = 0;
        try {
            ube = us.updateByExample(record, example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return ube;
    }
    /*
     * 查询...的数量
     */
    @ResponseBody
    @RequestMapping(value = "/updateByUser",method = RequestMethod.POST)
    public int updateByPrimaryKeySelective(User record){

        int ubp = 0;
        try {
            ubp = us.updateByPrimaryKeySelective(record);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return ubp;
    }
    /*
     * 查询...的数量
     */
    @ResponseBody
    @RequestMapping(value = "/updateByPK",method = RequestMethod.POST)
    public int updateByPrimaryKey(User record){

        int ubp = 0;
        try {
            ubp = us.updateByPrimaryKey(record);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return ubp;
    }

    @ResponseBody
    @RequestMapping("/userLogin")
    public int userLogin(HttpSession session, String username, String password){
        int flag=0;
        User user= us.findUserByUsernameAndPassword(username,password);
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
