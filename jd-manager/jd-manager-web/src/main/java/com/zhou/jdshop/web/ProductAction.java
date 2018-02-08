package com.zhou.jdshop.web;

import com.zhou.jdshop.dto.MessageResult;
import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.vo.TbProductCustom;
import com.zhou.jdshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jms.*;
import java.util.List;

@Controller
public class ProductAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JmsTemplate jmsTemplate;

    @Resource
    private Destination topicDestination;

//    @Autowired
@Resource
    private ProductService productService;

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
    public MessageResult saveProduct(TbProduct product){
        MessageResult ms = new MessageResult();
        try {
            Long pid = productService.saveProduct(product);
            jmsTemplate.send(topicDestination, new MessageCreator() {
                @Override
                public Message createMessage(Session session) throws JMSException {
                    TextMessage textMessage = session.createTextMessage( "addProduct?"+pid );
                    return textMessage;
                }
            });
            ms.setSuccess(true);
            ms.setMessage("新增1个商品成功");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ms;
    }

    @ResponseBody
    @RequestMapping("/editproduct")
    public MessageResult editProduct(TbProduct product){
        MessageResult ms = new MessageResult();
        int i=0;
        try {
            i=productService.editProduct(product);
            if(i>0) {
                jmsTemplate.send(topicDestination, new MessageCreator() {
                    @Override
                    public Message createMessage(Session session) throws JMSException {
                        TextMessage textMessage = session.createTextMessage(  "editProduct?"+product.getPid());
                        return textMessage;
                    }
                });
                ms.setSuccess(true);
                ms.setMessage("新增1个商品成功");
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ms;
    }

    @ResponseBody
    @RequestMapping("/updateproduct")
    public MessageResult deleteProduct(@RequestParam("pids[]") List<Long> pids,@RequestParam("pflag") Integer pflag){
        MessageResult ms = new MessageResult();
        int i=0;
        try {
            i=productService.updateProduct(pids,pflag);
            if(i>0){
                jmsTemplate.send(topicDestination, new MessageCreator() {
                    @Override
                    public Message createMessage(Session session) throws JMSException {
                        TextMessage textMessage = session.createTextMessage( "updateProduct?"+pids );
                        return textMessage;
                    }
                });
                ms.setSuccess(true);
                ms.setMessage("新增1个商品成功");
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ms;
    }
}
