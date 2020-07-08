package com.lengedyun.scheduledtask;

import com.lengedyun.config.ScheduledTaskConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjy
 * @title: ScheduledTaskTest
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 20:35
 */
public class ScheduledTaskTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);

    }
}
