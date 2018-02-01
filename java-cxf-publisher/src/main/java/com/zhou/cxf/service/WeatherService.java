package com.zhou.cxf.service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * 使用的是SOAP1.2协议发布的服务
 * User: DHC
 * Date: 2018/1/31
 * Time: 9:34
 * Version:V1.0
 */
@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherService {
    String queryWeather(String cityName);
}
