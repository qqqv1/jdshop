package com.zhou.jdshop.ws.service.main;

import com.zhou.jdshop.ws.service.impl.WeatherInterfaceImpl ;
import com.zhou.jdshop.ws.service.impl.WeatherInterfaceImplService ;

/**
 * User: DHC
 * Date: 2018/1/30
 * Time: 13:51
 * Version:V1.0
 */
public class WeatherClient {
    public static void main(String[] args) {
        //根据WSDL获取WeatherInterfaceImplService对象
        WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
        //获取到发布者的接口
        WeatherInterfaceImpl impl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
        //调用方法
        System.out.println(impl.queryWeather("北京1"));
    }
}
