package com.zhangyongwang.multithreads;

public class RunnableMultiThreads {
    static class NewThread implements Runnable {
        private String name;   // name of thread
        // 定义一个私有的 Thread 对象
        private Thread t;


        NewThread(String threadname) {
            name = threadname;
            // 创建一个 Thread 对象，把 tihs 传递给这个 Thread ,本质就是为了 给他 run()
            t = new Thread(this, name);
            System.out.println("New thread:" + t);
            t.start();  // Start the thread
        }


        // this id the entry point for thread.
        public void run() {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
            }
            System.out.println(name + "exiting.");
        }
    }

    public static void main(String args[]) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        System.out.println("Main thread exiting.");
    }


}


