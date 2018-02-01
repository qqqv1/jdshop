package com.zhou.jdshop.ws.qq.impl;

public class QqClient {
    public static void main(String[] args) {

        QqOnlineWebService qqOnlineWebService = new QqOnlineWebService();
        QqOnlineWebServiceSoap qqOnlineWebServiceSoap = qqOnlineWebService.getPort(QqOnlineWebServiceSoap.class);
        String result = qqOnlineWebServiceSoap.qqCheckOnline("2451961234");
        System.out.println(result);

    }
}
