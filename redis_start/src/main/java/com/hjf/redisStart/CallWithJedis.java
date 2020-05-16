package com.hjf.redisStart;

import redis.clients.jedis.Jedis;

/**
 * @author hjf
 * @date 2020-05-15 23:54
 */
public interface CallWithJedis {
    void call(Jedis jedis);
}
