package com.zhou.jdshop.dubbo.main;

import com.zhou.jdshop.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: DHC
 * Date: 2018/1/29
 * Time: 15:09
 * Version:V1.0
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        context.start();
        //获取对象
        DemoService demoService = (DemoService)context.getBean("demoService");
        System.out.println(demoService.sayHello("wyf"));
    }
}
