package com.lengedyun.wisely;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @author zjy
 * @title: WiselyConfiguration
 * @projectName springbase
 * @description: 组合注解
 * @date 2020/7/9 21:25
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan("com.lengedyun.wisely")
public @interface WiselyConfiguration {

    String[] value() default{};
}
