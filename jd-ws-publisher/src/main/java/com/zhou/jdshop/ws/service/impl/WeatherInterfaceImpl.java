package com.zhou.jdshop.ws.service.impl;

import com.zhou.jdshop.ws.service.WeatherInterface;

import javax.jws.WebService;

/**
 * User: DHC
 * Date: 2018/1/30
 * Time: 9:32
 * Version:V1.0
 */
@WebService
public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public String queryWeather(String cityName) {
        System.out.println("from client...."+cityName);
        String weather="晴";
        return weather;
    }
}
