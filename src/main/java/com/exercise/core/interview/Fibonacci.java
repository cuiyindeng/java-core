package com.exercise.core.interview;

public class Fibonacci {

    /**
     * n是第n个数，而不是具体的结果数
     * @param n
     * @return
     */
    public static int fib1(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        System.out.println(Thread.currentThread().getName() + ": n: " + n + ", (n-1): " + (n-1) + ", (n-2): " + (n-2));
        return fib1(n-1) + fib1(n-2);
    }

    public static int fib2(int n) {
        int i = 1;
        int t = 1;
        for (int s = 0; s < n; s++) {
            System.out.println(i);
            if (s > 0) {
                i = i + t;
                t = i - t;
            }
        }
        return t;
    }

    public static void main(String... args) {
        System.out.println("last num: " + fib2(5));
    }
}
