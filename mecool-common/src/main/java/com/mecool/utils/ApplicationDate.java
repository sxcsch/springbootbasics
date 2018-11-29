package com.mecool.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
@Configuration
@PropertySource(value = "myDate.properties")
public class ApplicationDate {

    @Autowired
    private Environment environment;

    @Value(value = "${baidu.url}")
    private String baidu;

    public String getBaidu() {
        baidu = environment.getProperty("baidu.url");
        return baidu;
    }

    public void setBaidu(String baidu) {
        this.baidu = baidu;
    }
}
