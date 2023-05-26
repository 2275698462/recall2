package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Springboot16RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void set() {
        HashOperations ops = redisTemplate.opsForHash();
        ops.put("info", "a", "aa");
    }

    @Test
    void get() {
        HashOperations ops = redisTemplate.opsForHash();
        Object a = ops.get("info","a");
        System.out.println(a);
    }

}
