package com.zhou.jdshop.search.web;

import com.zhou.jdshop.dto.TbSearchProductResult;
import com.zhou.jdshop.service.SearchService;
import com.zhou.jdshop.util.StrKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchIndexAction {
    @Autowired
    private SearchService searchService;

  /*  //留着
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(String pname, @RequestParam(defaultValue = "1") Integer page, Model model) {
        if (StrKit.notBlank(pname)) {
            //调用业务逻辑层的方法进行分页查询
            TbSearchProductResult result = searchService.search(pname, page, 12);

            //用于回显的数据
            //搜索
            model.addAttribute("query", pname);
            model.addAttribute("totalPages", result.getTotalPages());
            model.addAttribute("recordCount", result.getRecordCount());
            model.addAttribute("itemList", result.getItemList());
            model.addAttribute("page", page);
        }
        return "product-portal-list";
//        return "index";
    }*/
}
