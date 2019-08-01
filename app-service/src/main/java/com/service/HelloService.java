package com.service;

import com.api.HelloApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name HelloService
 * @Description TODO
 * @Author zz
 * @Date 2019/8/1  9:26
 * @Version 1.0
 **/
@RestController
public class HelloService implements HelloApi {
    @Override
    public String sayHello(String msg) {
        return "hello "+msg;
    }
}
