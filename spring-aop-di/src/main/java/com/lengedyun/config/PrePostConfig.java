package com.lengedyun.config;

import com.lengedyun.beanlife.BeanWayService;
import com.lengedyun.beanlife.Jsr250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zjy
 * @title: PrePostConfig
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/5 21:57
 */
@Configuration
@ComponentScan("com.lengedyun.beanlife")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    Jsr250WayService jsr250WayService(){
        return new Jsr250WayService();
    }
}
