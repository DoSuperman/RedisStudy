package com.hjf.redisStart;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author hjf
 * @date 2020-05-15 23:28
 */
public class MyJedisPool {
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool("192.168.0.180", 6379);

        try (Jedis jedis = jedisPool.getResource()){
            jedis.auth("123456");
            String ping = jedis.ping();

            System.out.println(ping);

        }

    }
}
