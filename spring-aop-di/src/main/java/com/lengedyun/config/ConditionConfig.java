package com.lengedyun.config;

import com.lengedyun.conditional.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author zjy
 * @title: ConditionConfig
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 21:06
 */
@Configuration
//@ComponentScan("com.lengedyun.conditional")
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }


}
