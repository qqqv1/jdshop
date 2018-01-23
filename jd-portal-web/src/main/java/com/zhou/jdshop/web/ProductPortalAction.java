package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.vo.TbProductCustom;
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
    public int total(@RequestParam("cname") String cname,@RequestParam String pname){
        int total=0;
        try{
            total=productService.total(cname,pname);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return total;
    }

    @ResponseBody
    @RequestMapping("productList")
    public List<TbProductCustom> productList(@RequestParam("page") int page, @RequestParam("cname") String cname, @RequestParam("pname") String pname){
        List<TbProductCustom> list=null;
        try{
            if(page>0) {
                list = productService.productList(page,cname,pname);
            }else {
                list = productService.productList(1,cname,pname);
            }
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("product")
    public TbProductCustom findProductById(@RequestParam("pid") Long pid){
        TbProductCustom tbProductCustom =null;
        try{
            tbProductCustom = productService.findProductById(pid);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return tbProductCustom;
    }
}
