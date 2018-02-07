package com.zhou.jdshop.search.web;

import com.zhou.jdshop.dto.ProductOption;
import com.zhou.jdshop.dto.TbSearchProductResult;
import com.zhou.jdshop.service.SearchService;
import com.zhou.jdshop.pojo.vo.TbProductCustom;
import com.zhou.jdshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ProductPortalAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

//    @Autowired
    @Resource
    private SearchService searchService;

//    @Autowired
    @Resource
    private ProductService productService;

    /*{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dubbo-consumer.xml");
        context.start();
        productService=(ProductService)context.getBean("productService");
        searchService=(SearchService)context.getBean("searchService");
    }*/

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
     * 根据搜索项商品并分页显示,返回的是商品集合
     * @param productOption 商品搜索项
     * @return 商品集合
     */
    @ResponseBody
    @RequestMapping("productList")
    public TbSearchProductResult productList(@RequestBody ProductOption productOption){
        TbSearchProductResult result=null;
        //调用业务逻辑层的方法进行分页查询
        result = searchService.search(productOption);

        return result;

       /* List<TbProductCustom> list=null;
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
        return list;*/
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
