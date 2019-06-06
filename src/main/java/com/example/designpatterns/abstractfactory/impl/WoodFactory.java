package com.example.designpatterns.abstractfactory.impl;

import com.example.designpatterns.abstractfactory.factory.FunitureAbstractFactory;
import com.example.designpatterns.abstractfactory.chair.Chair;
import com.example.designpatterns.abstractfactory.chair.WoodChair;
import com.example.designpatterns.abstractfactory.table.Table;
import com.example.designpatterns.abstractfactory.table.WoodTable;

public class WoodFactory extends FunitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
