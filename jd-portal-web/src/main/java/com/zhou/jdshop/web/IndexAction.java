package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.TbContent;
import com.zhou.jdshop.service.TbContentService;
import com.zhou.jdshop.util.PropKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexAction {

    @Autowired
    private TbContentService tbContentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public String page(@PathVariable("page") String page){
        return page;
    }

    @ResponseBody
    @RequestMapping("/sildeshow")
    public List<TbContent> sildeshow(){
        List<TbContent> list =null;
        Long cid = PropKit.use("lunbo.properties").getLong("categoryId");
//        System.out.println("Action cid"+cid);
        list=tbContentService.getContentListByCid(cid);
//        System.out.println("Action size"+list.size());
        return list;
    }
}