package com.zhou.cxf.service.main;

import com.zhou.cxf.service.WeatherService ;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: DHC
 * Date: 2018/1/31
 * Time: 15:04
 * Version:V1.0
 */
public class WeatherClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        WeatherService service = (WeatherService)context.getBean("weatherService");
        System.out.println(service.queryWeather("乌鲁木齐"));
    }
}
