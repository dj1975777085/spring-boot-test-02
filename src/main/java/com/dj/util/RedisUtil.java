package com.dj.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName RedisUtil
 * @Author 杜杰
 * @Date 2018/9/25 17:28
 **/
@Component
public class RedisUtil {
    public static RedisUtil redisUtil;

    public static Boolean set(String key,String value,RedisTemplate<String, String> redisTemplate){
        Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent(key, value);
        return aBoolean;
    }

}
