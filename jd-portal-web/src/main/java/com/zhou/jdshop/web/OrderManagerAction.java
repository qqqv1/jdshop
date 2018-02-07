package com.zhou.jdshop.web;

import com.zhou.jdshop.service.OrderService;
import com.zhou.jdshop.pojo.po.TbUser;
import com.zhou.jdshop.pojo.vo.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderManagerAction {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/order/addOrder")
	public String saveOrder(Cart order,HttpSession session) {
		int j=0;
		TbUser user=(TbUser)session.getAttribute("sessionUser");
		j=orderService.createOrder(order,user);
		if(j>0) {
			session.removeAttribute("cart");
			session.removeAttribute("order");
		}
		return "redirect:/pay";
	}

	@ResponseBody
	@RequestMapping("/order/orderList")
	public List<Cart> listOrder(){
		List<Cart> list =null;
		list=orderService.selectOrder();
		return list;
	}

	@RequestMapping("order/cartList")
	public String listCart(HttpSession session){
		Cart cart=(Cart)session.getAttribute("cart");
		Cart order=cart;
		session.setAttribute("order",order);
		return "redirect:/order-cart";
	}
}
