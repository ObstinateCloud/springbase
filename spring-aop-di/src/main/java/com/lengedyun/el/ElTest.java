package com.lengedyun.el;

import com.lengedyun.config.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: ElTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/6/2 7:39
 */
public class ElTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService =  context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
