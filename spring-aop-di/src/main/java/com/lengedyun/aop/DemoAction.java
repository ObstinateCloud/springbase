package com.lengedyun.aop;
/*
* 拦截规则注解
* */

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DemoAction {

    String name();
}
