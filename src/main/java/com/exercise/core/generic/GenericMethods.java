package com.exercise.core.generic;

public class GenericMethods {
    //泛型方法的返回类型前必须指定泛型（<T>）
    public <T> T f(T x) {
        try {
            return (T) x.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(gm);
    }
}
