package com.lengedyun.aop;

import org.springframework.stereotype.Service;

/**
 * @author zjy
 * @title: DemoAnnotationService
 * @projectName springbase
 * @description: 被拦截的类
 * @date 2020/5/27 7:19
 */

@Service
public class DemoAnnotationService {

    @DemoAction(name="注解式拦截的add操作")
    public void add(){}
}
