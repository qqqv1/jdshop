package com.zhou.cxf.service.main;

import com.zhou.cxf.service.WeatherService ;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * 单独使用cxf
 * User: DHC
 * Date: 2018/1/31
 * Time: 9:57
 * Version:V1.0
 */
public class WeatherClient {
    public static void main(String[] args) {
        //获取到JaxWsProxyFactoryBean
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        //设置接口
        factoryBean.setServiceClass(WeatherService.class);
        //设置地址
        factoryBean.setAddress("http://127.0.0.1:98/weather");
        //获取代理对象
        WeatherService service = factoryBean.create(WeatherService.class);
        System.out.println(service.queryWeather("大浙江"));
    }
}
