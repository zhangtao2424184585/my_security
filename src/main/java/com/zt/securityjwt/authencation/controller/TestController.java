package com.zt.securityjwt.authencation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/8/27 14:47
 * @Created by zhangtao
 */
@RestController
public class TestController {
    @RequestMapping("/admin/hello")
    public String hello(){
        return "hello world";
    }
}
