package com.lengedyun.aop;

import com.lengedyun.config.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: AopTest
 * @projectName springbase
 * @description: Aop测试类
 * @date 2020/5/28 7:09
 */
public class AopTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService annotationService = (DemoAnnotationService) context.getBean("demoAnnotationService");
        annotationService.add();
        DemoMethodService methodService = (DemoMethodService) context.getBean("demoMethodService");
        methodService.add();
        context.close();

    }
}
