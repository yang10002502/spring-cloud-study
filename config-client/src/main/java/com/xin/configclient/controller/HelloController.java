package com.xin.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

    @Value("${hello}")
    private String hello;

    @GetMapping("hello")
    public String sayHello() {
        return hello;
    }
}