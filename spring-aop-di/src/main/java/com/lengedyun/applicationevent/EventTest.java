package com.lengedyun.applicationevent;

import com.lengedyun.config.EventConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: EventTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 18:50
 */
public class EventTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publishMsg("hello application enent");
        context.close();

    }



}
