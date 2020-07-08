package com.lengedyun.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zjy
 * @title: ProfileConfig
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/5 22:45
 */

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from dev profile");
    }

    @Bean
    @Profile("pro")
    public DemoBean proDemoBean(){
        return new DemoBean("from pro profile");
    }


}
