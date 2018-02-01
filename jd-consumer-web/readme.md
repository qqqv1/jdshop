* dubbo消费者工程开发步骤
1. 创建工程（web工程）
2. 添加依赖（junit spring zookeeper zkClient dubbo）
3. 把提供方的接口添加到工程中
4. 添加xml spring-dubbo-consumer.xml
    * 消费方应用名
    * 注册中心地址
    * 接口信息
5. 编写测试类