package com.demo.appeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Name AppEurekaApplication
 * @Description TODO
 * @Author zz
 * @Date 2019/7/31  16:47
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class AppEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppEurekaApplication.class, args);
    }
}
