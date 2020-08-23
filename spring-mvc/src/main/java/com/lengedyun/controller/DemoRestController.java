package com.lengedyun.controller;

import com.lengedyun.entity.DemoObj;
import com.lengedyun.entity.DemoXmlObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjy
 * @title: DemoRestController
 * @projectName springbase
 * @description: TODO
 * @date 2020/8/23 20:30
 */

@RestController
@RequestMapping("/rest")
public class DemoRestController {


    @RequestMapping(value = "getJson",produces = "application/json;charset=UTF-8")
    public DemoObj getJson(DemoObj obj){
        return new DemoObj(obj.getId()+1,obj.getName()+"NB");
    }

    @RequestMapping(value = "getXml")
//    @RequestMapping(value = "getXml",produces = "application/xml;charset=UTF-8")//此方式不行
    public DemoXmlObj getXml(DemoObj obj){
        return new DemoXmlObj(obj.getId()+1,obj.getName()+"NB");
    }



}
