package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.vo.TbOrdersCustom;
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
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteOrderItems")
    public int deleteProduct(@RequestParam("ids[]") List<String> ids){
        int i = 0;
        try {
            i = orderService.deleteOrderItems(ids);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping("/order/{id}")
    public TbOrdersCustom getItemById(@PathVariable("id") String id) {
        return orderService.getOrderById(id);
    }


    /**
     * 修改订单
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/editOrdersCustom")
    public int editOrdersCustom(String title ,String id,String orderId, String num,String totalFee,String receiverName,String receiverMobile,String receiverAddress){
        int i = 0;
        try {
            i = orderService.editOrder(title,id,orderId,num,totalFee,receiverName,receiverMobile,receiverAddress);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }


}
