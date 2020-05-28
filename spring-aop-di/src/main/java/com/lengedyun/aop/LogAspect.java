package com.lengedyun.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zjy
 * @title: LogAspect
 * @projectName springbase
 * @description: 日志切面
 * @date 2020/5/27 7:24
 */

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.lengedyun.aop.DemoAction)")
    public void annotationPointCut(){

    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method =signature.getMethod();
        DemoAction action = method.getAnnotation(DemoAction.class);
        System.out.println("注解式拦截："+action.name());
    }

    @Before("execution(* com.lengedyun.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截器，"+method.getName());
    }
}
