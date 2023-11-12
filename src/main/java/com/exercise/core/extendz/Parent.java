package com.exercise.core.extendz;

public class Parent {

    public static String s = "parent";

    Parent() {
        System.out.println("Parent构造函数");
    }

    static {
        System.out.println("Parent静态代码块， s: " + s);
    }

    {
        System.out.println("Parent代码块， s: " + s);
    }
}
