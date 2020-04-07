package com.wj.com.wj;

import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        //创建jedis连接
        Jedis jedis = new Jedis("192.168.194.129",6379);
        String set = jedis.set("name", "john");
        System.out.println(set);
        jedis.close();
    }
}
