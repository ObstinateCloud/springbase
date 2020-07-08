package com.lengedyun.conditional;

import com.lengedyun.config.ConditionConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: ConditionalTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 21:10
 */
public class ConditionalTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下文件列表命令为："+listService.showListCmd());
    }
}
