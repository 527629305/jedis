package com.wj.com.wj;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedispoolTest {
    public static void main(String[] args) {
        //设置连接池
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(30);
        config.setMaxIdle(10);
        JedisPool pool = new JedisPool(config, "192.168.194.129");
        Jedis jedis = pool.getResource();
        jedis.set("age","21");
        jedis.close();
        pool.close();

    }
}
