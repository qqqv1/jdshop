package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.vo.Cart;
import javax.servlet.http.HttpSession;
import java.util.List;

public interface OrderManagerService {
	//生成订单
	int createOrder(Cart order,HttpSession session);

	//查询订单
	List<Cart> selectOrder();
}
