package com.exercise.core.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest1 {

	public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        A a = new A(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(a);
        }
        System.out.println("main线程执行。。。");
        executorService.shutdown();
        System.out.println("main线程结束。。。");
    }

}

class A implements Runnable {
    int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        //保证线程安全
        synchronized (this) {
            //查看当前i的值是否有序。
            i--;
            System.out.printf("当前线程：%s，当前i的值：%s \r\n", Thread.currentThread().getName(), i);
        }
    }
}