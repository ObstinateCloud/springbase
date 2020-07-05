package com.lengedyun.beanlife;

import com.lengedyun.config.PrePostConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: BeanLifeTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/5 22:07
 */

public class BeanLifeTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        Jsr250WayService jsr250WayService = context.getBean(Jsr250WayService.class);
        context.close();

    }
}
