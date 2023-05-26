package com.itheima;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class StringRedisApplicationTest {

    private RedisTemplate redisTemplate;

    private StringRedisTemplate stringRedisTemplate;
}
