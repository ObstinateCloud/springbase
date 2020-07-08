package com.lengedyun.aware;

import com.lengedyun.config.AwareConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: AwareTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 19:30
 */
public class AwareTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
