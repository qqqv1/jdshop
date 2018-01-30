package com.zhou.jdshop.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.zhou.jdshop.pojo.vo.Cart;
import com.zhou.jdshop.service.OrderManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderManagerAction {

	@Autowired
	private OrderManagerService orderManagerService;

	@RequestMapping("/order/addOrder")
	public String saveOrder(HttpSession session) {
		//从session中取购物车商品列表
		int i=0;
        i=orderManagerService.createOrder(session);
		return "pay";
	}

	@RequestMapping("/order/orderlist")
	public String listOrder(Model model){
		List<Cart> list =null;
		list=orderManagerService.selectOrder();
		model.addAttribute(list);
		return "pay";
	}

}
