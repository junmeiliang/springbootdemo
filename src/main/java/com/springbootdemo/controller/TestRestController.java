package com.springbootdemo.controller;

import com.springbootdemo.model.TestUser;
import org.springframework.web.bind.annotation.*;

/**
 * @RestController   // 整个类的所有方法返回值均是 字符串或json
 * GetMapping、PostMapping
 */

@RestController         // 整个类的所有方法返回值均是 字符串或json
public class TestRestController {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public TestUser getUser(){

        TestUser testUser = new TestUser();

        testUser.setParamName("test01");
        testUser.setParamLocation("sanjieke");

        return testUser;
    }
    @GetMapping("/getUser1")   // 仅仅支持get请求
    public TestUser getUser1(){

        TestUser testUser = new TestUser();

        testUser.setParamName("test01-get");
        testUser.setParamLocation("sanjieke-get");

        return testUser;
    }
    @PostMapping("/postUser2")   // 仅仅支持post请求
    public TestUser getUser2(){

        TestUser testUser = new TestUser();

        testUser.setParamName("test01-post");
        testUser.setParamLocation("sanjieke-post");

        return testUser;
    }
}
