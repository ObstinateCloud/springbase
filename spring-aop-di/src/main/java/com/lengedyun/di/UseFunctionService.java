package com.lengedyun.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjy
 * @title: UseFunctionService
 * @projectName springbase
 * @description: TODO
 * @date 2020/5/25 7:59
 */

@Service
public class UseFunctionService {

    @Autowired
    FunctionService functionService;

    public String useSayHello(String word){

        return functionService.sayHello(word);
    }


}
