package com.example.designpatterns.abstractfactory.chair;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
