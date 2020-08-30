package com.lengedyun.controller;

import com.lengedyun.entity.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zjy
 * @title: ConverterController
 * @projectName springbase
 * @description: TODO
 * @date 2020/8/30 18:04
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/converter",produces = {"application/x-widely"})
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj demoObj){
        System.out.println("12333");
        return demoObj;
    }
}
