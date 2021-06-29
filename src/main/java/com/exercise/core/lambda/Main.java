package com.exercise.core.lambda;

public class Main {
    public static void main(String[] args) {
        m("b", 1);
    }

    /**
     * lambda表达式必须存储这两个变量的值。
     * @param text
     * @param count
     */
    public static void m(String text, int count) {
        Runnable r = () -> {
            /**
             * lambda表达式被转换为只含有一个方法的对象，两个自由变量的值会被复制到该对象的实例变量中。
             * 所以被lambda表达式引用的变量的值是不能被改变的，下面的两句是错误的。
             */
//            count++;
//            text = "a";
            System.out.println(text);
        };

        new Thread(r).start();
    }
}
