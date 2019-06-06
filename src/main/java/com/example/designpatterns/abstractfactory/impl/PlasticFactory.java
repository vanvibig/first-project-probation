package com.example.designpatterns.abstractfactory.impl;

import com.example.designpatterns.abstractfactory.factory.FunitureAbstractFactory;
import com.example.designpatterns.abstractfactory.chair.Chair;
import com.example.designpatterns.abstractfactory.chair.PlasticChair;
import com.example.designpatterns.abstractfactory.table.PlasticTable;
import com.example.designpatterns.abstractfactory.table.Table;

public class PlasticFactory extends FunitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
