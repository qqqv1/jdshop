package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.TbContent;
import com.zhou.jdshop.service.TbContentService;
import com.zhou.jdshop.util.PropKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexAction {

    @Autowired
    private TbContentService tbContentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        Long cid = PropKit.use("lunbo.properties").getLong("categoryId");
        List<TbContent> list = tbContentService.getContentListByCid(cid);
        model.addAttribute("adList",list);
        return "index";
    }

    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public String page(@PathVariable("page") String page){
        return page;
    }
}