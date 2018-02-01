package com.zhou.jdshop.web;

import com.zhou.jdshop.pojo.vo.Cart;
<<<<<<< HEAD
import com.zhou.jdshop.pojo.vo.CartItem;
import com.zhou.jdshop.dubbo.service.OrderService;
import com.zhou.jdshop.dubbo.service.ProductService;
import com.zhou.jdshop.util.CommonsUtils;
=======
import com.zhou.jdshop.service.OrderManagerService;
>>>>>>> 8bdc5e9255f8d133d862e72234035e2e896168e3
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderManagerAction {

	@Autowired
	private OrderManagerService orderManagerService;

	@RequestMapping("/order/addOrder")
	public String saveOrder(Cart order,HttpSession session) {
		int j=0;
		j=orderManagerService.createOrder(order,session);
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
		list=orderManagerService.selectOrder();
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
