package com.example.springcore.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspectJ {

    @Before("execution(* com.example.springcore.aspectj.Hello.*())")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("before method: " + joinPoint.getSignature().getName());
    }
}
