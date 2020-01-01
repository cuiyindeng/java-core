package com.exercise.core.generic;


public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    /**
     * 参数化的Generator接口确保next的返回值是参数的类型。
     * @return
     */
    @Override
    public Integer next() {
        return fib(count++);
    }
    private int fib(int n) {
        if (n < 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 8; i++) {
            System.out.println(gen.next() + "");
        }
    }
}
