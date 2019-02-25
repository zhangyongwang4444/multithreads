package com.zhangyongwang.multithreads;

public class NewThread2 extends Thread {
    NewThread2(String name) {
        // Create a new , second thread
        super(name);
        System.out.println("New Thread2 Child thread:" + this);
        // 显式的 开始 执行这个线程  --> 做一些基本的初始化操作  --> 执行 run()
        start(); // Start the thread
        // return
    }


    // This is the entry point the second thread
    // 新的线程 入口
    public void run() {
        System.out.println("只有这个逻辑，只是来皮一皮");
    }


}
