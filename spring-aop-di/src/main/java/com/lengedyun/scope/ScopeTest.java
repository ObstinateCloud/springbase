package com.lengedyun.scope;

import com.lengedyun.config.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: ScopeTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/5/29 7:09
 */
public class ScopeTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singletonService1 = (DemoSingletonService) context.getBean("demoSingletonService");
        DemoSingletonService singletonService2 = (DemoSingletonService) context.getBean("demoSingletonService");
        System.out.println("singletonService:"+singletonService1.equals(singletonService2));

        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("prototypeService:"+prototypeService1.equals(prototypeService2));


    }
}
