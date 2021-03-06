package com.zhangyongwang.multithreads;

// 自定义的 线程类 NewThread
// 运行的 代码逻辑和  main() (主线程) 不同
public class NewThread extends Thread {
    NewThread(String name) {
        // Create a new , second thread
        super(name);
        System.out.println("Child Thread:" + this);
        // 显式的 开始 执行这个线程  --> 做一些基本的初始化操作  --> 执行 run()
        start(); // Start the thread
        // return
    }


    // This is the entry point the second thread
    // 新的线程 入口
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread:" + i);
                Thread.sleep(500); // 暂停执行一段时间，1000 ms = 1 s
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }

    // 主线程逻辑
    public static void main(String args[]) {
        // 创建新的子线程
        NewThread t1 = new NewThread("Thread1"); //  create a new thread
        // 调用完构造方法，start() 后，子线程开始执行，主线程返回到main()方法，继续执行下面的代码
        NewThread t2 = new NewThread("Thread2");

        NewThread t3 = new NewThread("Thread3");
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(1000); // 暂停执行一段时间，1000 ms = 1 s
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
