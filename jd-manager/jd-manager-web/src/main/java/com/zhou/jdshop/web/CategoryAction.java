package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.Category;
import com.zhou.jdshop.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CategoryService categoryService;

    @ResponseBody
    @RequestMapping(value = "/productCats", method = RequestMethod.GET)
    public List<Category> listCatsByParentId() {
        List<Category> list = null;
        try {
            list = categoryService.listCats();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/category/{cid}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable("cid") String cid) {
        return categoryService.getCategoryById(cid);
    }

    @ResponseBody
    @RequestMapping("/addCat")
    public int saveCategory(Category category){
        int i = 0;
        try {
            i = categoryService.saveCategory(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/editCat")
    public int editCategory(Category category){
        int i = 0;
        try {
            i = categoryService.editCategory(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/deleteCat")
    public int deleteCategory(@RequestParam("cids[]") List<String> cids){
        int i = 0;
        try {
            i = categoryService.deleteCategory(cids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
}
