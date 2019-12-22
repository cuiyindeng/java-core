package com.exercise.core.generic;

public class Tool<QQ> {

    private QQ q;

    public QQ getObject() {
        return q;
    }

    public void setObject(QQ object) {
        q = object;
    }

    public <W> void show(W str) {
        System.out.println("show: " + str);
    }

    public static <QQ> void method(QQ obj) {
        System.out.println("aaa");
    }
}
