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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(String keyword, @RequestParam(defaultValue = "1") Integer page, Model model) {
        if (StrKit.notBlank(keyword)) {
            //调用业务逻辑层的方法进行分页查询
            TbSearchProductResult result = searchService.search(keyword, page, 60);
            //用于回显的数据
            model.addAttribute("query", keyword);
            model.addAttribute("totalPages", result.getTotalPages());
            model.addAttribute("recordCount", result.getRecordCount());
            model.addAttribute("itemList", result.getItemList());
            model.addAttribute("page", page);
        }
        return "product-portal-list";
    }
}
