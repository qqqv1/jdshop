package com.zhou.cxf.service.main;

import com.zhou.cxf.service.WeatherService ;
import com.zhou.cxf.service.impl.WeatherServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * 单独使用cxf
 * User: DHC
 * Date: 2018/1/31
 * Time: 9:40
 * Version:V1.0
 */
public class WeatherServer {
    public static void main(String[] args) {
        //获取JaxWsServerFactoryBean
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        //设置天气接口的class
        factoryBean.setServiceClass(WeatherService.class);
        //设置天气接口的实现类实例
        factoryBean.setServiceBean(new WeatherServiceImpl());
        //设置发布的地址
        factoryBean.setAddress("http://127.0.0.1:98/weather");
        //发布
        factoryBean.create();
    }
}
