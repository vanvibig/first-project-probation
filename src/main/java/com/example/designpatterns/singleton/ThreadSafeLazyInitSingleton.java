package com.example.designpatterns.singleton;

public class ThreadSafeLazyInitSingleton {

    private static volatile ThreadSafeLazyInitSingleton INSTANCE;

    private ThreadSafeLazyInitSingleton() {

    }

    public static synchronized ThreadSafeLazyInitSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeLazyInitSingleton();
        }
        return INSTANCE;
    }
}
