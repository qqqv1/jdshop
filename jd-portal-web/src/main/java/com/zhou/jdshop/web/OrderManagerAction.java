package com.zhou.jdshop.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.zhou.jdshop.pojo.OrderInfo;
import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.po.TbUser;
import com.zhou.jdshop.pojo.vo.Cart;
import com.zhou.jdshop.pojo.vo.CartItem;
import com.zhou.jdshop.service.OrderManagerService;
import com.zhou.jdshop.util.JdResult;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 订单确认页面处理Controller
 * <p>Title: OrderCartController</p>
 * <p>Description: </p>
 * @version 1.0
 */
@Controller
public class OrderManagerAction {

	@Autowired
	private OrderManagerService orderManagerService;

	/**
	 * 展示订单确认页面
	 * <p>Title: showOrderCart</p>
	 * <p>Description: </p>
	 * @param request
	 * @return
	 */
	@RequestMapping("/order/order-cart")
	public String showOrderCart(HttpServletRequest request, HttpSession session) {
		//用户必须是登录状态
		//取用户id
		TbUser user = (TbUser) request.getAttribute("user");
		System.out.println(user.getUname());
		//根据用户信息取收货地址列表，使用静态数据。
		//把收货地址列表取出传递给页面
		//从session中取购物车商品列表展示到页面
		List<TbProduct> cartList = getCartItemList(request,session);
		request.setAttribute("cartList", cartList);
		//返回逻辑视图
		return "order-cart";
	}
	
	private List<TbProduct> getCartItemList(HttpServletRequest request,HttpSession session) {
		//从session中取购物车商品列表
        Cart cart = (Cart)session.getAttribute("cart");
        List<TbProduct> list = new ArrayList<>();
        for(CartItem cartItem : cart.getItems().values()){
            list.add(cartItem.getProduct());
        }
		return list;
	}
	
	/**
	 * 生成订单处理
	 */
	@RequestMapping(value="/order/create", method=RequestMethod.POST)
	public String createOrder(OrderInfo orderInfo, Model model) {
		//生成订单
		JdResult result = orderManagerService.createOrder(orderInfo);
		//返回逻辑视图
		model.addAttribute("orderId", result.getData().toString());
		model.addAttribute("payment", orderInfo.getPayment());
		//预计送达时间，预计三天后送达
		DateTime dateTime = new DateTime();
		dateTime = dateTime.plusDays(3);
		model.addAttribute("date", dateTime.toString("yyyy-MM-dd"));
		//返回success视图
		return "success";
	}
}
