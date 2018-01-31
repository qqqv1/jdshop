package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbOrderItemMapper;
import com.zhou.jdshop.dao.TbOrderMapper;
import com.zhou.jdshop.dao.TbOrderShippingMapper;
import com.zhou.jdshop.dao.TbOrdersCustomMapper;
import com.zhou.jdshop.pojo.po.*;
import com.zhou.jdshop.pojo.vo.Cart;
import com.zhou.jdshop.pojo.vo.CartItem;
import com.zhou.jdshop.pojo.vo.TbOrdersCustom;
import com.zhou.jdshop.service.OrderService;
import com.zhou.jdshop.util.CommonsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbOrderMapper ordersDao;

    @Autowired
    private TbOrdersCustomMapper ordersCustomDao;

    @Autowired
    private TbOrderItemMapper tbOrderItemDao;

    @Autowired
    private TbOrderShippingMapper tbOrderShippingDao;

    /**
     * 查询所有订单
     *
     * @return
     */
    @Override
    public List<TbOrder> listOrders() {
        List<TbOrder> list = null;
        try {
            list = ordersCustomDao.selectByExample(null);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }


    /**
     * 删除选中订单
     *
     * @param ids 选中的订单详情ID
     * @return
     */
    @Override
    public int deleteOrderItems(List<String> ids) {
        int i = 0;
        try {
            TbOrderItem tbOrderItem = new TbOrderItem();
            tbOrderItem.setTitle("0");
            TbOrderItemExample example = new TbOrderItemExample();
            TbOrderItemExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i = tbOrderItemDao.updateByExampleSelective(tbOrderItem, example);
         /*   TbOrder order =new TbOrder();
            order.setStatus(0);
            TbOrderExample example = new TbOrderExample();
            TbOrderExample.Criteria criteria = example.createCriteria();
//            criteria.andOidIn(ids);
            i = ordersDao.updateByExampleSelective(order,example);*/
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 根据ID查询订单
     *
     * @param id
     * @return
     */
    @Override
    public TbOrdersCustom getOrderById(String id) {
        TbOrdersCustom ordersCustom = null;
        try {
            ordersCustom = ordersCustomDao.selectOrderById(id);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return ordersCustom;
    }

    /**
     * 修改订单
     *
     * @param
     * @param id
     * @param orderId
     * @return
     */
    @Transactional
    @Override
    public int editOrder(String title, String id, String orderId, String num, String totalFee, String receiverName, String receiverMobile, String receiverAddress) {
        int i = 0;
        try {
            //存放3张表,订单表和订单详情表和tb_order_shipping
            //tb_orders

            //   tb_order_item
            TbOrderItem tbOrderItem = new TbOrderItem();
            tbOrderItem.setNum(Integer.parseInt(num));
            tbOrderItem.setTotalFee(Double.parseDouble(totalFee));
            tbOrderItem.setTitle(title);
            TbOrderItemExample example1 = new TbOrderItemExample();
            TbOrderItemExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andIdEqualTo(id);
            i += tbOrderItemDao.updateByExampleSelective(tbOrderItem, example1);

            //tb_order_shipping
            TbOrderShipping tbOrderShipping = new TbOrderShipping();
            tbOrderShipping.setReceiverName(receiverName);
            tbOrderShipping.setReceiverMobile(receiverMobile);
            tbOrderShipping.setReceiverAddress(receiverAddress);
            TbOrderShippingExample example2 = new TbOrderShippingExample();
            TbOrderShippingExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andOrderIdEqualTo(orderId);
            i += tbOrderShippingDao.updateByExampleSelective(tbOrderShipping, example2);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }


    //生成订单
    @Override
    public int createOrder(HttpSession session) {
        int i=0;
        //生成订单id
        String orderId = CommonsUtils.getUUID();
        //向订单表插入数据，需要补全pojo的属性
        Cart cart = (Cart)session.getAttribute("cart");
        TbUser tbUser = (TbUser)session.getAttribute("sessionUser");
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(orderId);
        tbOrder.setPaymentType(1);
        tbOrder.setStatus(1);
        tbOrder.setCreateTime(new Date());
        tbOrder.setUpdateTime(new Date());
        tbOrder.setUserId(tbUser.getUid());
        i+=ordersDao.insert(tbOrder);
        for(CartItem cartItem : cart.getItems().values()){
            TbOrderItem tbOrderItem=new TbOrderItem();
            tbOrderItem.setOrderId(orderId);
            tbOrderItem.setItemId(cartItem.getProduct().getPid());
            tbOrderItem.setPrice(cartItem.getProduct().getShopPrice());
            tbOrderItem.setNum(cartItem.getCount());
            tbOrderItem.setPicPath(cartItem.getProduct().getPimage());
            tbOrderItem.setTotalFee(cartItem.getSubTotal());
            tbOrderItem.setTitle("1");
            tbOrderItem.setId(CommonsUtils.getUUID());
            i+=tbOrderItemDao.insert(tbOrderItem);
        }
        return i;
    }

    //查询订单
    @Override
    public List<Cart> selectOrder() {
        List<Cart> list = new ArrayList<>();
        TbOrderExample example=new TbOrderExample();
        TbOrderExample.Criteria criteria = example.createCriteria();
        criteria.andStatusNotEqualTo(0);
        List<TbOrder> orders=ordersDao.selectByExample(example);
        for(TbOrder order:orders){
            Cart cart = new Cart();
            Map<Long,CartItem> map=new HashMap<>();
            TbOrderItemExample itemExample=new TbOrderItemExample();
            TbOrderItemExample.Criteria itemCriteria = itemExample.createCriteria();
            itemCriteria.andOrderIdEqualTo(order.getOrderId());
            List<TbOrderItem> orderItems=tbOrderItemDao.selectByExample(itemExample);
            for (TbOrderItem orderItem:orderItems){
                CartItem cartItem=new CartItem();
                TbProduct product=new TbProduct();
                product.setPid(orderItem.getItemId());
                product.setShopPrice(orderItem.getPrice());
                product.setPimage(orderItem.getPicPath());
                cartItem.setProduct(product);
                cartItem.setCount(orderItem.getNum());
                cartItem.setSubTotal(orderItem.getTotalFee());
                map.put(orderItem.getItemId(),cartItem);
            }
            cart.setItems(map);
            cart.setTotal(order.getPayment());
            list.add(cart);
        }
        return list;
    }
}
