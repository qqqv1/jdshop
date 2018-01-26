package com.zhou.jdshop.web;

import com.zhou.jdshop.dto.ProductOption;
import com.zhou.jdshop.pojo.vo.TbProductCustom;
import com.zhou.jdshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductPortalAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    /**
     * 根据搜索项查询分页总数
     * @param productOption 商品搜索项
     * @return 分页总数
     */
    @ResponseBody
    @RequestMapping("pageTotal")
    public int total(@RequestBody ProductOption productOption){
        int total=0;
        try{
            total=productService.total(productOption);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return total;
    }

    /**
     * 根据搜索项商品并分页显示
     * @param productOption 商品搜索项
     * @return 商品集合
     */
    @ResponseBody
    @RequestMapping("productList")
    public List<TbProductCustom> productList(@RequestBody ProductOption productOption){
        List<TbProductCustom> list=null;
        try{
            if(productOption.getPage()>0) {
                list = productService.productList(productOption);
            }else {
                productOption.setPage(1);
                list = productService.productList(productOption);
            }
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据id查询商品
     * @param pid 商品id
     * @return 对应id商品
     */
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
