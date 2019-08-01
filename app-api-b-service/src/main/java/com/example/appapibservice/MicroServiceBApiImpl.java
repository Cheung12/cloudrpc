package com.example.appapibservice;

import com.example.appapib.MicroServiceBApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name MicroServiceBApiImpl
 * @Description TODO
 * @Author zz
 * @Date 2019/8/1  17:56
 * @Version 1.0
 **/
@RestController
public class MicroServiceBApiImpl implements MicroServiceBApi {
    @Override
    public String sayHello() {
        return "hello";
    }
}
