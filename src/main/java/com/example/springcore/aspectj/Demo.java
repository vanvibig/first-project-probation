package com.example.springcore.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectj.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.method1();
        System.out.println("\n");
        hello.method2();
    }
}
