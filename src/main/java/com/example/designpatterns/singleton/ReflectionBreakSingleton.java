package com.example.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakSingleton {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EagerInitSingleton instance1 = EagerInitSingleton.getInstance();
        EagerInitSingleton instance2 = null;

        Constructor<?>[] constructors = EagerInitSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instance2 = (EagerInitSingleton) constructor.newInstance();
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
