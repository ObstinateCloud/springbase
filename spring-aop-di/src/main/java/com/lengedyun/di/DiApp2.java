package com.lengedyun.di;

import com.lengedyun.config.DiConfig;
import com.lengedyun.config.DiConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用java 配置方式进行bean注入
 *
 */
public class DiApp2
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig2.class);
//        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
        UseFunctionService2 useFunctionService = (UseFunctionService2) context.getBean("getUseFunctionService2");
        System.out.println(useFunctionService.useSayHello("Java Config"));
        context.close();
    }
}
