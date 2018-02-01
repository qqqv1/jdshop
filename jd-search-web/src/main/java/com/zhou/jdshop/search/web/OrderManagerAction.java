package com.zhou.jdshop.search.web;

import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.vo.Cart;
import com.zhou.jdshop.pojo.vo.CartItem;
<<<<<<< HEAD
import com.zhou.jdshop.dubbo.service.OrderService;
import com.zhou.jdshop.dubbo.service.ProductService;
import com.zhou.jdshop.util.CommonsUtils;
=======
import com.zhou.jdshop.service.OrderManagerService;
import com.zhou.jdshop.service.ProductService;
>>>>>>> 8bdc5e9255f8d133d862e72234035e2e896168e3
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderManagerAction {

	@Autowired
	private OrderManagerService orderManagerService;

	@Autowired
	private ProductService productService;

	@RequestMapping("/order/addOrder")
	public String saveOrder(Cart order,HttpSession session) {
		//从session中取购物车商品列表
		int i=0;
        i=orderManagerService.createOrder(order,session);
        session.removeAttribute("cart");
        session.removeAttribute("order");
		return "redirect:/pay";
	}

	@ResponseBody
	@RequestMapping("/order/orderList")
	public List<Cart> listOrder(){
		List<Cart> list =null;
		list=orderManagerService.selectOrder();
		return list;
	}

	@ResponseBody
	@RequestMapping("/order/toOrder")
	public Cart toOrder(@RequestParam("pids[]") List<Long> pids,@RequestParam("pns[]") List<Integer> pns,@RequestParam("total") double total , HttpSession session){
		Cart order=new Cart();
		order.setTotal(total);
		List<TbProduct> products=productService.findProductByIds(pids);
		Map<Long,CartItem> map=new HashMap<>();
		for (int i=0;i<products.size();i++){
			CartItem cartItem =new CartItem();
			cartItem.setProduct(products.get(i));
			cartItem.setCount(pns.get(i));
			map.put(pids.get(i),cartItem);
		}
		order.setItems(map);
		session.setAttribute("order",order);
		return order;
	}
}
