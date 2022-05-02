package com.exercise.core.cloneable;

public class A implements Cloneable {
    public A() {
        System.out.println("构造方法运行。。。");
    }

    @Override
    protected A clone() throws CloneNotSupportedException {
        return (A)super.clone();
    }
}
