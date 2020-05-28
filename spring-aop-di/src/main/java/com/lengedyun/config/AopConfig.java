package com.lengedyun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zjy
 * @title: AopConfig
 * @projectName springbase
 * @description: Aop配置
 * @date 2020/5/28 7:06
 */

@Configuration
@ComponentScan("com.lengedyun.aop")
@EnableAspectJAutoProxy
public class AopConfig {


}
