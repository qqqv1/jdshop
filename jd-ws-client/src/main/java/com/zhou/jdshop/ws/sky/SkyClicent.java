package com.zhou.jdshop.ws.sky;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class SkyClicent {
    public static void main(String[] args) throws MalformedURLException {
        /// 1.创建服务视图
        /**
         * 参数1：wsdl地址
         * 参数2：服务名称
         */
        URL url=new URL("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl");
        /**
         * 参数1：命名空间地址
         *       targetNamespace="http://WebXml.com.cn/"
         * 参数2：服务视图名称  ,service的name值
         */
        QName qName =new QName("http://WebXml.com.cn/", "MobileCodeWS");
        Service service = Service.create(url, qName);
        // 2.获取服务实现类
       /* WeatherWebServiceSoap mobileCodeWSSoap = service.getPort(WeatherWebServiceSoap.class);
        // 3.调用查询方法
        String result = mobileCodeWSSoap.getMobileCodeInfo("18888888888", "");
        System.out.println(result);*/
    }

}
