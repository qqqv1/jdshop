package com.zhou.jdshop.web;

import com.zhou.jdshop.dubbo.service.FileService;
import com.zhou.jdshop.dubbo.service.ProductService;
import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.vo.TbProductCustom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @Autowired
    private FileService fileService;

//    @ResponseBody
//    @RequestMapping(value = "/products",method = RequestMethod.GET)
//    public List<Product> listProducts(){
//        List<Product> list=null;
//        try {
//            list = productService.listProducts();
//        }catch (Exception e){
//            logger.error(e.getMessage(),e);
//            e.printStackTrace();
//        }
//        return list;
//    }
    @ResponseBody
    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public List<TbProductCustom> listProducts(){
        List<TbProductCustom> list=null;
        try {
            list = productService.listProducts();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/product/{pid}", method = RequestMethod.GET)
    public TbProduct getItemById(@PathVariable("pid") Long pid) {
        return productService.getProductById(pid);
    }

    @ResponseBody
    @RequestMapping("/addproduct")
    public int saveProduct(TbProduct product){
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
    public int editProduct(TbProduct product){
        int i = 0;
        try {
            i = productService.editProduct(product);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/updateproduct")
    public int deleteProduct(@RequestParam("pids[]") List<Long> pids,@RequestParam("pflag") Integer pflag){
        int i = 0;
        try {
            i = productService.updateProduct(pids,pflag);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
}
