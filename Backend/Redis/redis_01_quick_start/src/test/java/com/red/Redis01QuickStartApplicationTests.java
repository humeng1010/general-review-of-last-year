package com.red;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Redis01QuickStartApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void testString() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name","你好");

        Object name = valueOperations.get("name");
        System.out.println(name);
    }

    @Test
    void testStringRedisTemplate(){
        String prefix = "name:";
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set(prefix+"lisi","李四");

        String name = stringStringValueOperations.get(prefix + "lisi");
        System.out.println(name);
    }

}
