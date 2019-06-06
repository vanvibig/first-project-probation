package com.example.designpatterns.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    public static final long serialVersionUID = 1741825395699241705L;

    private SerializedSingleton() {

    }

    private static class SingletonHelper {
        public static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
