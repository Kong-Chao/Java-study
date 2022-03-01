package com.study.base.multithreading;

/**
 * 守护线程与yield
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyRunable4 mr4 = new MyRunable4();
        Thread t = new Thread(mr4);
    }
}

class MyRunable4 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<50 ;i++){
            System.out.println("--" + i);
        }
    }
}
