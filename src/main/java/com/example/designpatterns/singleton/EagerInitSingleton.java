package com.example.designpatterns.singleton;

public class EagerInitSingleton {

    /**
     * Class được khởi tạo ngay khi gọi đến
     */

    private static final EagerInitSingleton INSTANCE = new EagerInitSingleton();

    private EagerInitSingleton() {
    }

    public static EagerInitSingleton getInstance() {
        return INSTANCE;
    }

}
