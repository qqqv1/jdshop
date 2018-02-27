package com.zhou.jdshop.search.web;

import com.zhou.jdshop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller("/user")
public class CasAction {

    private static final Logger logger = LoggerFactory.getLogger(CasAction.class);

    @Resource
    private UserService userService;

    @RequestMapping("/loginSuccess")
    public String loginSuccess(){

        logger.info("登录成功");

        return "../index";
    }
}
