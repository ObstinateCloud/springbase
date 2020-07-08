package com.lengedyun.multthread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zjy
 * @title: AsyncTaskService
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 19:50
 */
@Service
public class AsyncTaskService{

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务编号："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务编号puls："+(i+1));
    }


}
