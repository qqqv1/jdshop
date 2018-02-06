package com.zhou.jdshop.search.web;

import com.zhou.jdshop.pojo.po.TbProductCat;
import com.zhou.jdshop.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CategoryPortalAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

//    @Autowired
    @Resource
    private CategoryService categoryService;

    /*{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dubbo-consumer.xml");
        context.start();
        categoryService=(CategoryService)context.getBean("categoryService");
    }*/

    @ResponseBody
    @RequestMapping("/categoryList")
    public List<TbProductCat> categoryList(){
        List<TbProductCat> list=null;
        try {
            list=categoryService.listCats();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }
}
