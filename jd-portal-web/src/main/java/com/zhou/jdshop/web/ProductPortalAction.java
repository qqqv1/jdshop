package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.vo.ProductCustom;
import com.zhou.jdshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductPortalAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping("pageTotal")
    public int total(@RequestParam("cname") String cname){
        int total=0;
        try{
            total=productService.total(cname);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return total;
    }

    @ResponseBody
    @RequestMapping("productList")
    public List<ProductCustom> productList(@RequestParam("page") int page,@RequestParam("cname") String cname){
        List<ProductCustom> list=null;
        try{
            if(page>0) {
                list = productService.productList(page,cname);
            }else {
                list = productService.productList(1,cname);
            }
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

}