* JAX-WS发布者工程的创建步骤：
1. 创建工程（web java）
2. 创建业务逻辑层的接口和方法
3. 实现接口（使用自己的相关的技术或者数据库）
4. 创建服务
    * EndPoint.publish(发布地址,实现类的实例);
    
* JAX-WS调用者工程的创建步骤
1. 获取发布者的WSDL（WEB服务描述语言xml）
    * wsdl的形式：http://xxx.xxx.xxx.xx/xxx?wsdl
    * wsdl的域名形式：http://xxx/xxx?wsdl
    * 要跟发布者确认是在内网还是公网
2. 使用JDK的wsimport命令产生相关类文件
    * wsimport -s . http://xxx/xxx?wsdl
3. 创建调用者工程（web java）
4. 创建包（包的路径要与targetNamespace = "http://impl.service.ws.jdshop.zhou.com/"）
5. 创建测试类
    * 创建service：<service name="WeatherInterfaceImplService">
    * 获取接口：<portType name="WeatherInterfaceImpl">（getPort）
    * 调用方法打印 queryWeather(cityName)


* 作为一个发布者要提供内容
1. 可访问的WSDL
2. 调用者测试DEMO
3. 接口开发帮助文档

* 作为一个调用者有三种实现手段
1. wsimport导出客户端，然后编码实现
2. 客户端编程调用方式
3. HttpURLConnection调用方式