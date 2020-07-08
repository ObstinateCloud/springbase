package com.lengedyun.applicationevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author zjy
 * @title: DemoEvent
 * @projectName springbase
 * @description: 自定义事件
 * @date 2020/7/8 18:38
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
