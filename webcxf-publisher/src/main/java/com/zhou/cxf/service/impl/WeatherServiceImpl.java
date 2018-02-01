package com.zhou.cxf.service.impl;

import com.zhou.cxf.service.WeatherService;

/**
 * User: DHC
 * Date: 2018/1/31
 * Time: 9:38
 * Version:V1.0
 */
public class WeatherServiceImpl implements WeatherService {
    @Override
    public String queryWeather(String cityName) {
        System.out.println("from client : " + cityName);
        return "大晴天";
    }
}
