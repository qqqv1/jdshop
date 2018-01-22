package com.zhou.jdshop.util;


import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

//public class JedisTest {

  /*  @Test
    public void testJedis1() {
        Jedis jedis = new Jedis("101.132.38.253", 6379);
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "100");
        map.put("b", "200");
        jedis.hmset("w3ckey", map);
    }

    @Test
    public void testJedis2() {
        JedisPool jedisPool = new JedisPool("101.132.38.253", 6379);
        Jedis jedis = jedisPool.getResource();
    }*/

   /* @Test
    public void testJedis3() {
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        //将6个节点加入到集合中
        nodes.add(new HostAndPort("139.196.79.132", 7001));
        nodes.add(new HostAndPort("139.196.79.132", 7002));
        nodes.add(new HostAndPort("139.196.79.132", 7003));
        nodes.add(new HostAndPort("139.196.79.132", 7004));
        nodes.add(new HostAndPort("139.196.79.132", 7005));
        nodes.add(new HostAndPort("139.196.79.132", 7006));
        //使用构造方法创建集群对象
        JedisCluster jedisCluster = new JedisCluster(nodes);
        //将jediscluster当成例1中jedis使用即可
        System.out.println(jedisCluster.get("name"));
    }*/


//}
