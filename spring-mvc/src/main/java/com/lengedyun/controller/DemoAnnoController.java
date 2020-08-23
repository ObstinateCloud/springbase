package com.lengedyun.controller;

import com.lengedyun.entity.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zjy
 * @title: DemoAnnoController
 * @projectName springbase
 * @description: TODO
 * @date 2020/8/21 7:30
 */

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String index(HttpServletRequest request){
        return "url:"+request.getRequestURI()+" can access";
    }

    @RequestMapping(value="/pathvar/{str}",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String demoPathVar(@PathVariable String str,HttpServletRequest request){
        return "url:"+request.getRequestURI()+" can access,str="+str;
    }

    /**
     * 请求路径中带.号
     * @param str
     * @param request
     * @return
     */
    @RequestMapping(value="/pathvar/xx.yy/{str}",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String demoPathVarSpecial(@PathVariable String str,HttpServletRequest request){
        return "url:"+request.getRequestURI()+" can access,str="+str;
    }

    @RequestMapping(value = "requestParam",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String passRequestParam(Long id,HttpServletRequest request){
        return "url:"+request.getRequestURI()+" can access,id="+id;
    }

    @RequestMapping(value = "obj",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request){
        return "url:"+request.getRequestURI()+" can access,obj="+obj.toString();
    }

    @RequestMapping(value = {"name1","name2"},produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String remove(HttpServletRequest request){
        return "url:"+request.getRequestURI()+" can access";
    }


}
