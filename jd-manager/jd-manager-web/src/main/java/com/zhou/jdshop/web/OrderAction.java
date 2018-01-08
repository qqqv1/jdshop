package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.Orders;
import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OrderService orderService;

    /**
     * 查询所有订单
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public List<Orders> listOrders(){
        List<Orders> list=null;
        try {
            list = orderService.listOrders();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 增加订单
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addOrders",method = RequestMethod.POST)
    public int addOrders(){
       return 0;
    }
   /* @ResponseBody
    @RequestMapping(value = "/item",method = RequestMethod.POST)
    public int saveItem(TbItem item,String itemDesc){
        int i = 0;
        try {
            i = itemService.saveItem(item,itemDesc);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }*/
}
