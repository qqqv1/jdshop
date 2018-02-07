package com.zhou.jdshop.search.web;

import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.po.TbUser;
import com.zhou.jdshop.pojo.vo.Cart;
import com.zhou.jdshop.pojo.vo.CartItem;
import com.zhou.jdshop.service.OrderService;
import com.zhou.jdshop.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderManagerAction {

//	@Autowired
	@Resource
	private OrderService orderService;

//	@Autowired
	@Resource
	private ProductService productService;

	/*{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dubbo-consumer.xml");
		context.start();
		productService=(ProductService)context.getBean("productService");
		orderService=(OrderService)context.getBean("orderService");
	}*/

	@RequestMapping("/order/addOrder")
	public String saveOrder(Cart order, HttpSession session) {
		//从session中取购物车商品列表
		int i=0;
		TbUser user =(TbUser)session.getAttribute("sessionUser");
        i=orderService.createOrder(order,user);
        session.removeAttribute("cart");
        session.removeAttribute("order");
		return "redirect:/pay";
	}

	@ResponseBody
	@RequestMapping("/order/orderList")
	public List<Cart> listOrder(){
		List<Cart> list =null;
		list=orderService.selectOrder();
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
