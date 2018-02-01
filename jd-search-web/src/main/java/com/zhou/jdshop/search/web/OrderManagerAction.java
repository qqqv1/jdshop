package com.zhou.jdshop.search.web;

import com.zhou.jdshop.pojo.po.TbOrder;
import com.zhou.jdshop.pojo.po.TbOrderItem;
import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.po.TbUser;
import com.zhou.jdshop.pojo.vo.Cart;
import com.zhou.jdshop.pojo.vo.CartItem;
import com.zhou.jdshop.dubbo.service.OrderService;
import com.zhou.jdshop.dubbo.service.ProductService;
import com.zhou.jdshop.util.CommonsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

//订单确认页面处理Controller

@Controller
public class OrderManagerAction {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    /*@RequestMapping("/order/order-cart/")
    public String showOrderCart(HttpServletRequest request,HttpSession session, Map<String, Object> map){
      //用户必须是登陆状态
      TbUser user = (TbUser)session.getAttribute("user");
              if(user == null){
                  return "client-login";
              }
              return "";
      //取用户id

      //根据用户信息取收货地址列表

      //把收货地址取出来传递给页面

      //从session中取购物车商品列表展示到页面

      //返回逻辑试图
    }*/

    //保存订单
    public String saveOrder(HttpSession session, Map<String, Object> map) {
        //用户必须是登陆状态
        TbUser user = (TbUser) session.getAttribute("sessionUser");
        if (user == null) {
            return "client-login";
        }
        //从session获取购物车对象
        Cart cart = (Cart) session.getAttribute("cart");
        //如果购物车为空，则返回到我的购物车页面
        if (cart == null) {
            return "shoppingcart";
        }
        //订单对象
        TbOrder order = new TbOrder();
        order.setPayment(cart.getTotal());
        // 1:未付款. 2.已经付款，没有发货 3.发货，没有确认发货 4.交易完成
        order.setStatus(1);
        //设置订单时间
        order.setCreateTime(new Date());
        //设置订单关联的客户
        order.setUserId(user.getUid());
        //设置订单项集合：
        Set<TbOrderItem> sets = new HashSet<TbOrderItem>();
        for (CartItem cartItem : cart.getItems().values()) {
            //订单项的信息从购物车项获得的。
            TbOrderItem orderitem = new TbOrderItem();
            orderitem.setNum(cartItem.getCount());
            orderitem.setPrice(cartItem.getSubTotal());
            orderitem.setItemId(cartItem.getProduct().getPid());
            //双向关联时在多的一方设置一的一方的属性
            orderitem.setOrderId(order.getOrderId());
            //把orderitem对象添加到集合中
            sets.add(orderitem);
            orderService.insertOrderItem(orderitem);
        }
        //双向关联时在一的一方设置多的一方的属性
        order.setOrderId(CommonsUtils.getUUID());
        orderService.insert(order);
        //清除购物车
        session.removeAttribute("cart");
        map.put("order", order);
        return "order";
    }

    private List<TbProduct> getCartItemList(HttpServletRequest request) {
        //从session中取购物车商品列表
        List<TbProduct> list=new ArrayList<TbProduct>();
        return list;
    }

    /*
     * 付款成功后跳转回来的路径:
     * r6_Order,r3_Amt 接收付款成功后的参数:
     */
    @RequestMapping(value = "/callBack")
    public String callBack(String r6_Order, Integer r3_Amt, Map<String, Object> map) {
        // 修改订单的状态:
        TbOrder currOrder = orderService.getOrderById(r6_Order);
        // 修改订单状态为2:已经付款:
        currOrder.setStatus(2);
        orderService.insert(currOrder);
        map.put("success", "支付成功!订单编号为: " + r6_Order + " 付款金额为: " + r3_Amt);
        return "shoppingcart";
    }

  /* 确认订单的操作,为订单付款:
   * addr:收货人地址 name:收货人 phone:联系电话  oid:订单的oid
   * pd_FrpId:接收支付通道编码
   */
 /* @RequestMapping(value = "/payOrder")
  public String payOrder(Integer oid, String addr, String name, String phone, String total, HttpSession session,
                         Map<String, Object> map) {
    Order order = orderService.findByOid(oid);
    order.setAddr(addr);
    order.setName(name);
    order.setPhone(phone);
    orderService.update(order);

    User user = order.getUser();
    Wallet wallet = user.getWallet();
    Float money = wallet.getMoney();
    //	System.out.println("money!"+money);
    Float total1 = Float.parseFloat(total);

    if (money >= total1) {       //更新商品数量

      System.out.println("start::");
      //System.out.println(cart.getTotal());
      for (OrderItem orderItem : order.getOrderItems()) {
        Integer pid = orderItem.getProduct().getPid();
        Integer inventory = orderItem.getProduct().getInventory();
        Product product = orderItem.getProduct();
        product.setInventory(inventory - orderItem.getCount());

        System.out.println(orderItem.getProduct().getPdesc());
        System.out.println("购买后的次数=" + product.getInventory());
        productService.update(product);
      }
      System.out.println("end::");

      //减去消费的价格
      wallet.setMoney(money - total1);
      walletService.update(wallet);

      // 修改订单的状态:
      Order currOrder = orderService.findByOid(oid);
      // 修改订单状态为2:已经付款:
      currOrder.setState(2);
      orderManagerService.save(currOrder);

      map.put("paymentSuccess", "success");
      return "orderList";
    }
    map.put("paymentFalse", "false");
    return "orderList";
  }*/

    /*
     * 付款成功后跳转回来的路径:
     * r6_Order,r3_Amt 接收付款成功后的参数:
     */
    @RequestMapping(value = "/success")
    public String callBack2(String r6_Order, Integer r3_Amt, Map<String, Object> map) {
        // 修改订单的状态:
        TbOrder currOrder = orderService.getOrderById(r6_Order);
        // 修改订单状态为2:已经付款:
        currOrder.setStatus(2);
        orderService.insert(currOrder);
        map.put("success", "支付成功!订单编号为: " + r6_Order + " 付款金额为: " + r3_Amt);
        return "success";
    }

    //确认收货
    @RequestMapping(value = "updateState/{oid}")
    public ModelAndView updateState(@PathVariable("oid") String oid) {
        System.out.println(oid);
        TbOrder order = orderService.getOrderById(oid);
        order.setStatus(4);
        orderService.insert(order);
        ModelAndView model = new ModelAndView("redirect:/findOrderByUid/1");
        return model;
    }
}
