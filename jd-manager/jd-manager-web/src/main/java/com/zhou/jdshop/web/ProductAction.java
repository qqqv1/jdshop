package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public List<Product> listProducts(){
        List<Product> list=null;
        try {
            list = productService.listProducts();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/addproduct")
    public int saveProduct(Product product){
        int i = 0;
        try {
            i = productService.saveProduct(product);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/editproduct")
    public int editProduct(){
        return 0;
    }

    @ResponseBody
    @RequestMapping("/deleteproduct")
    public int deleteProduct(){
        return 0;
    }
}
