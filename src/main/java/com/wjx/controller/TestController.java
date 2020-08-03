package com.wjx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("getexc")
    public String getSum(){
        int a=2/0;
        return "ss";
    }
}
