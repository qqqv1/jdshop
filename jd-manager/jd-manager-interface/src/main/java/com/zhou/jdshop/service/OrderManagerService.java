package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.OrderInfo;
import com.zhou.jdshop.util.JdResult;

public interface OrderManagerService {

	JdResult createOrder(OrderInfo orderInfo);
}
