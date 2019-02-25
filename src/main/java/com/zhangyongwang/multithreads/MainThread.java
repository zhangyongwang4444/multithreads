package com.zhangyongwang.multithreads;

public class MainThread {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();   // 获取当前线程对象 这里是主线程
        // 在 Java 语法层面 ！ 线程就是一个 Thread类的对象！

        System.out.println("Current thread:" + t);

        // change the name of the thread
        t.setName("My Thread ");
        System.out.println("Thread id:" + t.getId());
        System.out.println("After name change:" + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000); // 暂停执行一段时间，1000 ms = 1 s
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
