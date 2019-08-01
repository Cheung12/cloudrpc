package com.example.appapib;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/MicroServiceBApi")
public interface MicroServiceBApi {
    @GetMapping("/hello")
    String sayHello();
}
