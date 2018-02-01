package com.zhou.jdshop.search.web;

import com.zhou.jdshop.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
