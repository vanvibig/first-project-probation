package com.example.designpatterns.abstractfactory.factory;

import com.example.designpatterns.abstractfactory.MaterialType;
import com.example.designpatterns.abstractfactory.impl.PlasticFactory;
import com.example.designpatterns.abstractfactory.impl.WoodFactory;

public class FunitureFactory {

    private FunitureFactory() {

    }

    public static FunitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case WOOD:
                return new WoodFactory();
            case PLASTIC:
                return new PlasticFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsuported");
        }
    }
}
