package com.zhou.jdshop.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * User: DHC
 * Date: 2018/1/29
 * Time: 14:29
 * Version:V1.0
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
