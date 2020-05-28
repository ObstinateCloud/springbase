package com.lengedyun.di;

import org.springframework.stereotype.Service;

/**
 * @author zjy
 * @title: FunctionService
 * @projectName springbase
 * @description: TODO
 * @date 2020/5/25 7:55
 */
@Service
public class FunctionService {

    public String sayHello(String word){

        return "Hello,"+word;
    }
}
