package com.lengedyun.config;

import com.lengedyun.di.FunctionService;
import com.lengedyun.di.UseFunctionService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zjy
 * @title: DiConfig
 * @projectName springbase
 * @description: TODO
 * @date 2020/5/25 8:01
 */
@Configuration
@ComponentScan("com.lengedyun.di")
public class DiConfig {

    public FunctionService getFunctionService(){
        return new FunctionService();
    }

}
