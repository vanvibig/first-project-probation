package com.example.designpatterns.singleton;

public class LazyInitSingleton {

    private static LazyInitSingleton INSTANCE;

    private LazyInitSingleton() {

    }

    public static LazyInitSingleton getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new LazyInitSingleton();
        }

        return INSTANCE;
    }
}
