package com.xuyang.springcloud.server01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Server01Application {

    public static void main(String[] args) {
        SpringApplication.run(Server01Application.class, args);
    }

}
