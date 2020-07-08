package com.lengedyun.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: ProfileTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 18:32
 */
public class ProfileTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("pro");
        context.register(ProfileConfig.class);
        context.refresh();
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
