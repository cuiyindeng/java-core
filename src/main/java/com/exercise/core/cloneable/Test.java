package com.exercise.core.cloneable;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();
        A clone = a.clone();
        System.out.println(a.equals(clone));
    }
}
