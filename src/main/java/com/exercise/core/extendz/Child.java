package com.exercise.core.extendz;

public class Child extends Parent{

    public static String s = "Child";

    Child() {
        System.out.println("Child构造函数");
    }

    static {
        System.out.println("Child静态代码块， s: " + s);
    }

    {
        System.out.println("Child代码块， s: " + s);
    }
}
