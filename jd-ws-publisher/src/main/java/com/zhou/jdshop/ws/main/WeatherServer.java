package com.zhou.jdshop.ws.main;

import com.zhou.jdshop.ws.service.impl.WeatherInterfaceImpl;

import javax.xml.ws.Endpoint;

/**
 * User: DHC
 * Date: 2018/1/30
 * Time: 9:34
 * Version:V1.0
 */
public class WeatherServer {
    public static void main(String[] args) {
        //第一个参数是指发布的地址，不是wsdl
        //第二个参数是指实现类
        Endpoint.publish("http://127.0.0.1:90/weather",new WeatherInterfaceImpl());
//        Endpoint.publish("http://139.196.79.132:8080/weather",new WeatherInterfaceImpl());
//        Endpoint.publish("http://139.196.79.132:80/weather",new WeatherInterfaceImpl());

    }
}
