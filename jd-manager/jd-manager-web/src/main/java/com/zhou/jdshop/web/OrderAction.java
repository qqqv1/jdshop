package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.vo.OrdersCustom;
import com.zhou.jdshop.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public List<TbOrder> listOrders(){
        List<TbOrder> list=null;
        try {
            list = orderService.listOrders();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 删除订单
     * @param oids
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteOrders")
    public int deleteProduct(@RequestParam("itemids[]") List<String> oids){
        int i = 0;
        try {
            i = orderService.deleteOrders(oids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/order/{itemid}")
    public OrdersCustom getItemById(@PathVariable("itemid") String itemid) {
        return orderService.getOrderById(itemid);
    }


    /**
     * 修改订单
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/editOrdersCustom")
    public int editOrdersCustom(TbOrder orders,String oid,String itemid, Integer count,Double subtotal){
        int i = 0;
        try {
            i = orderService.editOrder(orders,oid,itemid,count,subtotal);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }


}
