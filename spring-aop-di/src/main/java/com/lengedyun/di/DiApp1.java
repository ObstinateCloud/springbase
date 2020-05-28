package com.lengedyun.di;

import com.lengedyun.config.DiConfig;
import com.lengedyun.di.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用扫描的方式进行bean注入
 *
 */
public class DiApp1
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = (UseFunctionService) context.getBean("useFunctionService");
        System.out.println(useFunctionService.useSayHello("Di"));
        context.close();
    }
}
