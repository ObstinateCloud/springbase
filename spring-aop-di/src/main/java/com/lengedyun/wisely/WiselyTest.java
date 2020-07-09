package com.lengedyun.wisely;

import com.lengedyun.config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: WiselyTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/9 21:39
 */

public class WiselyTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoWiselyService demoService = context.getBean(DemoWiselyService.class);
        demoService.outputResult();
        context.close();
    }
}
