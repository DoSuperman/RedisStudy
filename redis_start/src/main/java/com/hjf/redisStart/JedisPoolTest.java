package com.hjf.redisStart;

/**
 * @author hjf
 * @date 2020-05-16 0:00
 */
public class JedisPoolTest {
    public static void main(String[] args) {
        Redis redis = new Redis();
        redis.excute(jedis -> {
            System.out.println(jedis.ping());
        });
    }
}
