package com.lengedyun.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zjy
 * @title: DemoListener
 * @projectName springbase
 * @description: 事件监听器
 * @date 2020/7/8 18:42
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我" + this.getClass().getSimpleName() + "收到了" + demoEvent.getSource().getClass().getSimpleName() + "的消息：" + msg);
    }
}
