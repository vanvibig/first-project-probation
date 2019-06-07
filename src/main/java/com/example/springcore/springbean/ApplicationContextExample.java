package com.example.springcore.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExample {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DataSource obj = (DataSource) context.getBean("dataSource");
        obj.printConnection();
    }
}
