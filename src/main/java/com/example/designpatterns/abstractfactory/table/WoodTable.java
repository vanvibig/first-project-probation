package com.example.designpatterns.abstractfactory.table;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create woord table");
    }
}
