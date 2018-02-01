*  CXF+Spring整合创建发布者的步骤
1. 创建maven web工程（骨架）
2. 添加依赖（cxf spring jsp）
3. 修改web.xml（contextConfigLocation ContextLoaderListener CXFServlet）
4. 创建service层接口 querWeather
5. 创建service层接口的实现类
6. 配置spring.xml 
    * 配置实现类 bean
    * 配置JaxWsServerFactoryBean 
        * serviceClass
        * serviceBean
        * address
7. 启动TOMCAT
8. http://localhost:99/pub/ws/weather?wsdl

* CXF+Spring整合创建调用者的步骤
1. 要能访问WSDL
2. wsdl2java生成客户端代码
3. 创建调用者工程（maven web）
4. 添加依赖（cxf spring jsp）
5. 创建包（targetNamespace反写）
6. 拷贝
7. 配置spring.xml
    * jaxws:client 
        * id
        * address
        * serviceClass
8. 测试类
    * new ClassPathXmlApplicationContext(xml文件);
    * getBean(id)
    * queryWeather(cityName);