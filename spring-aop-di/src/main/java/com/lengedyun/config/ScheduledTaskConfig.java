package com.lengedyun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zjy
 * @title: ScheduledTaskConfig
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 20:32
 */
@Configuration
@ComponentScan("com.lengedyun.scheduledtask")
@EnableScheduling
public class ScheduledTaskConfig {
}
