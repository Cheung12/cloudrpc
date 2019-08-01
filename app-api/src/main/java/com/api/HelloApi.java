package com.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/testA")
public interface HelloApi {
    @RequestMapping("/hello/{msg}")
    String sayHello(@PathVariable String msg);
}
