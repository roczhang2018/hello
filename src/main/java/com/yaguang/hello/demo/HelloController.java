package com.yaguang.hello.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("greeting")
    public  String hello(){
        return  "hello3";
    }
}
