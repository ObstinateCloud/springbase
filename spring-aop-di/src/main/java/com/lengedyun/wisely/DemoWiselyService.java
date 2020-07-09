package com.lengedyun.wisely;

import org.springframework.stereotype.Service;

/**
 * @author zjy
 * @title: DemoService
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/9 21:31
 */
@Service
public class DemoWiselyService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
