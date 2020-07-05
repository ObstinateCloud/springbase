package com.lengedyun.beanlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zjy
 * @title: Jsr250WayService
 * @projectName springbase
 * @description: Jsr250中注解方式实现
 * @date 2020/7/5 21:49
 */
public class Jsr250WayService {

    @PostConstruct
    public void init(){
        System.out.println("Jsr250-init-method");
    }

    public Jsr250WayService(){
        super();
        System.out.println("初始化构造函数Jsr250WayService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Jsr250-destory-method");
    }
}
