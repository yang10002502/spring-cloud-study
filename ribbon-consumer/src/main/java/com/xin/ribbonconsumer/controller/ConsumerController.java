package com.xin.ribbonconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer")
    public String hello() {
        return restTemplate.getForEntity("http://eureka-client/hello", String.class).getBody();
    }
}