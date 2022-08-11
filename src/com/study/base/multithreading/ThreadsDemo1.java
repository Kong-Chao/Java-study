package com.study.base.multithreading;

/**
 * 进程与线程
 * 1.进程：程序是指令和数据的有序集合，其本身没有任何运行的含义，是一个静态的概念。而进程是程序在处理机上的依次执行过程，是一个动态的该概念。
 *  进程是一个具有一定独立功能的程序，一个实体，每一个进程都有它自己的地址空间。
 *  2.进程的状态
 *  进程执行时的间断性，决定进程的可能具有多种状态，事实中的进程具有以下三种基本状态：
 *  （1）就绪状态--Ready
 *  （2）运行状态-- running
 *  （3）阻塞状态-- Blocked
 *
 *  3.线程：线程在进程的基础上的进一步划分，一个进程启动之后，里面声望若干个程序又可以划分为若干个线程。
 *  线程：是进程中的一个执行路径，共享一个内存空间，线程之间可以自由的切换，并发执行，一个进程最少有一个线程（单线程程序）
 *
 * 例如：同时下载多个电影
 *  并行：就是两个任务同时运行（多个CPU）
 *  并发：两个任务同时请求运行，而处理器一次只能接收一个任务，就会把两个任务安排轮流执行，由于CPU时间片运行时间较短，就会感觉到两个任务在同时执行
 *
 * 实现线程的两种方式，集成Thread类和实现Runnable接口，通常建议实现接口方式，因为接口可以实现多个，而集成只能是一个
 * 线程休眠：在当前线程的执行中，暂停指定的毫秒数，目的是让出CPU执行的时间片，让其他的佛南工作的线程可以执行，但不会释放对象锁
 *
 *
 *
 * */
public class ThreadsDemo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        //推荐
        MyRunnable mr = new MyRunnable();
        Thread t2 = new Thread(mr);
        t2.start();
        mt.start();
        }
}

/**
 实现线程的第一种方式
 */
class MyThread extends  Thread{
    public void run(){
        for (int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 实现线程的第二种方式
 */
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
