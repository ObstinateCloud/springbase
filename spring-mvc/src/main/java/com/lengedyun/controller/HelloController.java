package com.lengedyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zjy
 * @title: HelloController
 * @projectName springbase
 * @description: TODO
 * @date 2020/8/20 7:11
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
