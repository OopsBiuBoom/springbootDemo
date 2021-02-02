package com.bii.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller标识是一个控制层
@Controller
public class HelloController {

    @ResponseBody
    // @RequestMapping("/hello")当hello请求过来时，会进入到这个方法
    @RequestMapping("/hello")
    public String hello() {
        return "Hello!!";
    }
}
