package com.springbootdemo.controller;

import com.springbootdemo.configModel.ConfigModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义配置文件读取
 */
@Controller
public class ConfigController {

    @Value("${ljm.paramName}")   // paramName 要和properties中的变量保持一致
    private String paramName;

    @Value("${ljm.paramLocation}")
    private String paramLocation;

    @Autowired
    private ConfigModel configModel;

    @RequestMapping("/testParam")
    public @ResponseBody String returnResult(){
        return paramName + " -- " +  paramLocation + " == "
                + configModel.getParamName() + " -- " + configModel.getParamLocation();
    }
}
