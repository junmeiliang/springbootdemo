package com.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 第一个 SpringBoot程序
@Controller
public class TestController {

    @RequestMapping("/test")  // 访问地址
    public @ResponseBody String test(){

        return "hello Spring Boot .";
    }
}
