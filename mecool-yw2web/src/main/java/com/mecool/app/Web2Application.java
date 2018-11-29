package com.mecool.app;

import com.sun.jersey.spi.container.WebApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Web2Application {
    public static void main(String[] args) {
        SpringApplication.run(Web2Application.class, args);
    }
}
