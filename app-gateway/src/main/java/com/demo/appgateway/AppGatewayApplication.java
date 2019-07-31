package com.demo.appgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Name AppGatewayApplication
 * @Description TODO
 * @Author zz
 * @Date 2019/7/31  17:45
 * @Version 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class AppGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppGatewayApplication.class,args);
    }
}
