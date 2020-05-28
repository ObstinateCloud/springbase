package com.lengedyun.config;

import com.lengedyun.di.FunctionService2;
import com.lengedyun.di.UseFunctionService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zjy
 * @title: DiConfig
 * @projectName springbase
 * @description: 不使用包扫描进行注入
 * @date 2020/5/25 8:01
 */
@Configuration
public class DiConfig2 {

    @Bean
    public FunctionService2 getFunctionService2(){
        return new FunctionService2();
    }

    @Bean
    public UseFunctionService2 getUseFunctionService2(){
        UseFunctionService2 useFunctionService2 = new UseFunctionService2();
        useFunctionService2.setFunctionService(getFunctionService2());
        return useFunctionService2;
    }



}
