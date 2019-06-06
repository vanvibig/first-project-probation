package com.example.designpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static class SingletonHelper {
        public static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
