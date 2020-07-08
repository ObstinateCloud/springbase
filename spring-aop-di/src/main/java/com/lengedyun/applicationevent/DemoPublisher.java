package com.lengedyun.applicationevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author zjy
 * @title: DemoPublisher
 * @projectName springbase
 * @description: 消息发布者
 * @date 2020/7/8 18:46
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext context;

    public void publishMsg(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }
}
