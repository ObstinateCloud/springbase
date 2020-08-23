package com.lengedyun.controller;

import com.lengedyun.entity.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zjy
 * @title: AdviceController
 * @projectName springbase
 * @description: TODO
 * @date 2020/8/24 7:02
 */

@Controller
@RequestMapping("advice")
public class AdviceController {

    @RequestMapping(value = "exception")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj demoObj){
        throw  new IllegalArgumentException("非常抱歉，参数有误/"+"来自ModelAttribute："+msg);
    }
}
