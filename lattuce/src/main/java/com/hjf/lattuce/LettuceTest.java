package com.hjf.lattuce;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

/**
 * @author hjf
 * @date 2020-05-17 0:18
 */
public class LettuceTest {
    public static void main(String[] args) {
        RedisClient redisClient = RedisClient.create("redis://123456@192.168.0.180");
        StatefulRedisConnection<String,String> connection = redisClient.connect();
        RedisCommands<String,String> sync = connection.sync();
        sync.set("name","hjf");
        String name = sync.get("name");
        System.out.println(name);
    }
}
