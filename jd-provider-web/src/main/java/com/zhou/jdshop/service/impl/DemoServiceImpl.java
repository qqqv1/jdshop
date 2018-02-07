package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dubbo.service.DemoService;
import com.zhou.jdshop.dubbo.service.DemoService;

/**
 * User: DHC
 * Date: 2018/1/29
 * Time: 14:24
 * Version:V1.0
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
