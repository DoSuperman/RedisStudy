package com.hjf.redisStart;

import redis.clients.jedis.Jedis;

/**
 * @author hjf
 * @date 2020-05-15 23:23
 */
public class MyJedis {
    public static void main(String[] args) {
        //1.构造一个jedis对象，因为默认端口是6379，和我的redis一样，所以不配置端口
        Jedis jedis = new Jedis("192.168.0.180");
        //设置jedis对象连接密码
        jedis.auth("123456");
        //测试是否连接成功
        String ping = jedis.ping();
        //返回pong表示连接成功
        System.out.println(ping);
    }
}
