package com.lengedyun.beanlife;

/**
 * @author zjy
 * @title: BeanWayService
 * @projectName springbase
 * @description: bean生命周期
 * @date 2020/7/5 21:49
 */
public class BeanWayService {

    public void init(){
        System.out.println("@bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数BeanWayService");
    }

    public void destroy(){
        System.out.println("@bean-destroy-method");
    }
}
