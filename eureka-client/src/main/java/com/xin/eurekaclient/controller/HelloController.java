package com.xin.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${server.port}")
    private String port;

    private static String INFO_FORMAT = "hello world {0} 端口为您服务";

    @GetMapping("hello")
    public String hello() {
        String info = MessageFormat.format(INFO_FORMAT, port);
        logger.info(info);
        return info;
    }
}