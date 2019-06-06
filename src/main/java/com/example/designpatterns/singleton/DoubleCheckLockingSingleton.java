package com.example.designpatterns.singleton;

public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton INSTANCE;

    private DoubleCheckLockingSingleton() {

    }

    public static DoubleCheckLockingSingleton getInstance() {

        // check if instance created
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                // check again, maybe just created recently
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
