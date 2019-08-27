package com.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// 该注解表示我是一个springboot的应用程序
@SpringBootApplication
public class SpringbootdemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        // 启动 springboot应用程序（启动 spring容器以及内嵌的tomcat容器）
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }
    @Override // 当前类的名称： SpringbootdemoApplication.class
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(SpringbootdemoApplication.class);
    }
}
