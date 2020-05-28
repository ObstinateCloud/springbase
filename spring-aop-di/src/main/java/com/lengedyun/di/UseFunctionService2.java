package com.lengedyun.di;


/**
 * @author zjy
 * @title: UseFunctionService
 * @projectName springbase
 * @description: TODO
 * @date 2020/5/25 7:59
 */

public class UseFunctionService2 {

    FunctionService2 functionService;

    public String useSayHello(String word){

        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService2 functionService2){
        this.functionService = functionService2;
    }


}
