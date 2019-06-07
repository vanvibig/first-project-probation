package com.example.springcore.springaop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class DemoAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after method: " + method.getName());
    }
}
