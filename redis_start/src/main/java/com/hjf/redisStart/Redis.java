package com.hjf.redisStart;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author hjf
 * @date 2020-05-15 23:51
 */
public class Redis {
    private JedisPool pool;

    public Redis() {
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        //最大连接数
        config.setMaxTotal(500);
        //最大等待时间，如果是-1表示没有限制
        config.setMaxWaitMillis(30000);
        //在空闲时检查有效性
        config.setTestOnBorrow(true);

        /**
         *1.redis服务器地址
         * 2.redis端口
         * 3.连接超时时间
         * 4.密码
         */
        pool = new JedisPool(config,"192.168.0.180",6379,30000,"123456");
    }

    public void excute(CallWithJedis callWithJedis){
        try (Jedis jedis = pool.getResource()){
            jedis.auth("123456");
            callWithJedis.call(jedis);
        }
    }
}
