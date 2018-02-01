package com.zhou.cxf.action;

import com.zhou.cxf.service.WeatherService ;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * User: DHC
 * Date: 2018/1/31
 * Time: 15:08
 * Version:V1.0
 */
@Controller
public class WeatherAction {
    @Resource
    private WeatherService weatherService;

    public static void main(String[] args) {

//        System.out.println( weatherService.queryWeather("画水镇"));
    }
}
