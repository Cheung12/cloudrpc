package com.example.appapibservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppApiBServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApiBServiceApplication.class, args);
    }

}
