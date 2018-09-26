package com.dj.springboot.controller;

import com.dj.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author 杜杰
 * @Date 2018/9/25 14:31
 **/
@RestController
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(Logger.class);
    @RequestMapping("hello")
    public String hello(){
        RedisUtil.set("dj", "138811");
        return "423";
    }

}
