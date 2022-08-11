package com.study.base.multithreading;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程同步
 * 1.多线程共享数据：会发生线程不安全的情况，在多线程的操作中，多线程有可能同时处理同一个资源，这就是多线程中的共享数据
 * 2.线程同步：
 * 解决数据共享问题，必须使用同步，所谓的同步就是指多个线程在同一段时间内只能有一个线程执行指定代码，其他线程要等待此线程完成以后才能继续执行。
 * 线程进行同步有一下两种方式：
 * （1）同步代码块
 *  synchronized(需要同步的对象){
 *      需要同步的操作；
 *  }
 * （2）同步方法
 * public synchronized void method（）{
 *      需要同步的操作；
 * }
 * （3）Lock（reentrant lock）可重入锁
 * 多线程编程时，一些敏感数据不允许被多个线程访问，需要使用同步访问技术，保证数据在任何时候，最多只有一个线程访问，以保证数据的完整性
 *  同步准则，避免产生死锁、性能危险的风险
 *  （1）使用代码块保持简短，把不随线程变化的预处理和后处理移除synchronized块
 *  （2）不用阻塞，如：inoutStream.read()
 *   （3）在持有锁时候，不要对其他对象调用方法
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        MyRunnable5 mr5 =new MyRunnable5();
        Thread t1 = new Thread(mr5);
        Thread t2 = new Thread(mr5);
        t1.start();
        t2.start();
    }

}

class MyRunnable5 implements Runnable{

    private int ticket = 10; //售票
    //private Object obj = new Object(); //同步锁
    @Override
    public void run() {
        for (int i = 0; i< 300; i++){
            if (ticket > 0){
//                synchronized (this){ //会出现-1的情况，需要if判断放到同步块中
//                    ticket--;
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.print("你购买的票剩余" + ticket +"张" +"\n");
//                }

//                method();
                method2();
            }
        }


    }

    // 同步方法：同步的对象是当前对象this
    private synchronized void method(){
        if (ticket > 0){
            ticket--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("你购买的票剩余" + ticket +"张" +"\n");
        }

    }

    // 互斥锁
    ReentrantLock lock = new ReentrantLock();
    //Lock 实现同步
    private void method2(){
        lock.lock(); //添加锁
        try {
            if (ticket > 0){
                ticket--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("你购买的票剩余" + ticket +"张" +"\n");
            }
        }finally {
            lock.unlock(); //释放锁
        }
    }
}
