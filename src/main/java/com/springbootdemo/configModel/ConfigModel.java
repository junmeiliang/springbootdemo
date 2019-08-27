package com.springbootdemo.configModel;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Component：把普通pojo实例化到spring容器中
 * ConfigurationProperties：将整个配置映射成一个对象
 */
@Component
@ConfigurationProperties(prefix = "ljm")
public class ConfigModel {

    private String paramName;
    private String paramLocation;

    public String getParamName() {
        return paramName;
    }

    public String getParamLocation() {
        return paramLocation;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public void setParamLocation(String paramLocation) {
        this.paramLocation = paramLocation;
    }
}
