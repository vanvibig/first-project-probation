package com.example.designpatterns.abstractfactory;

import com.example.designpatterns.abstractfactory.chair.Chair;
import com.example.designpatterns.abstractfactory.factory.FunitureAbstractFactory;
import com.example.designpatterns.abstractfactory.factory.FunitureFactory;
import com.example.designpatterns.abstractfactory.table.Table;

public class Client {

    public static void main(String[] args) {
        FunitureAbstractFactory factory = FunitureFactory.getFactory(MaterialType.PLASTIC);

        Chair chair = factory.createChair();
        chair.create();

        Table table = factory.createTable();
        table.create();
    }
}
