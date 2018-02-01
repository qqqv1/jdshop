package com.zhou.jdshop.web;

import com.zhou.jdshop.dubbo.service.CategoryService;
import com.zhou.jdshop.pojo.po.TbProductCat;
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
    public List<TbProductCat> listCats() {
        List<TbProductCat> list = null;
        try {
            list = categoryService.listCats();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/listCats1", method = RequestMethod.GET)
    public List<TbProductCat> listCats1() {
        List<TbProductCat> list = null;
        try {
            list = categoryService.listCats1();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/listCats2", method = RequestMethod.GET)
    public List<TbProductCat> listCats2() {
        List<TbProductCat> list = null;
        try {
            list = categoryService.listCats2();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/listCats3", method = RequestMethod.GET)
    public List<TbProductCat> listCats3() {
        List<TbProductCat> list = null;
        try {
            list = categoryService.listCats3();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/category/{cid}", method = RequestMethod.GET)
    public TbProductCat getCategoryById(@PathVariable("cid") Long cid) {
        return categoryService.getCategoryById(cid);
    }

    @ResponseBody
    @RequestMapping("/addCat")
    public int saveCategory(TbProductCat category){
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
    @RequestMapping("/addCat1")
    public int saveCat1(TbProductCat category){
        int i = 0;
        try {
            i = categoryService.saveCat1(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/addCat2")
    public int saveCat2(TbProductCat category){
        int i = 0;
        try {
            i = categoryService.saveCat2(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/addCat3")
    public int saveCat3(TbProductCat category){
        int i = 0;
        try {
            i = categoryService.saveCat3(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/editCategory")
    public int editCategory(TbProductCat category){
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
    @RequestMapping("/editCat")
    public int editCat(TbProductCat category){
        int i = 0;
        try {
            i = categoryService.editCat(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/deleteCat")
    public int deleteCategory(@RequestParam("cids[]") List<Long> cids){
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
