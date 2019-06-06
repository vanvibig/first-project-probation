package com.example.designpatterns.abstractfactory.factory;

import com.example.designpatterns.abstractfactory.chair.Chair;
import com.example.designpatterns.abstractfactory.table.Table;

public abstract class FunitureAbstractFactory {

    public abstract Chair createChair();
    public abstract Table createTable();
}
