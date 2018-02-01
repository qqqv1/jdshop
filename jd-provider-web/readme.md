* dubbo提供方工程开发步骤
1. 创建工程（web工程）
2. 添加依赖（junit spring zookeeper zkClient dubbo）
3. 创建service的接口
4. 创建service接口的实现类
5. 添加xml spring-dubbo-provider.xml
    * 提供方应用名
    * 注册中心地址
    * 接口信息
    * 实现类信息
    * dubbo协议在20880端口暴露服务
6. 编写测试类
    * Provider
    * main 
    * IoC容器启动
    
    * java工程--web工程--ttshop