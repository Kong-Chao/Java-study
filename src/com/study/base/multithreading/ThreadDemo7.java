package com.study.base.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 线程生命周期和线程池
 * 生命周期：首先new出一个对象，放入线程中启动线程，线程进入就绪状态，当抢到cpu执行时间片，进入运行状态，yield则放弃本次时间片进入到就绪状态，当运行结束或异常退出就是Dead状态，wait则是进入休眠状态，直到会唤醒进入就绪状态
 * 线程池：先创建线程的一种技术。线程池在还没有任务到来之前，创建一定数量的线程，放入空闲队列中，然后对这些资源进行复用。减少频繁的创建和销毁对象。
 * jdk1.5版本以上提供了现成的线程池
 * Java里面线程池的顶级接口是Executor，是一个执行线程的工具。
 * 线程池接口是ExecutorService。
 * java.util.concurrent 包： 并发编程中很常用的实用工具类
 * Executor 接口：
 * 执行已提交的 Runnable 任务的对象。
 *
 * ExecutorService 接口：
 * Executor 提供了管理终止的方法，以及可为跟踪一个或多个异步任务执行状况而生成 Future 的方法。
 *
 * Executors 类：
 * 此包中所定义的Executor、ExecutorService等的工厂和实用方法。
 * 在Executors类里面提供了一些静态工厂，生成一些常用的线程池
 */
public class ThreadDemo7 {
    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread t = new Thread(mt);
//        t.start();
        //创建线程池的四种方式：
        //创建单线程线程池
//        ExecutorService es = Executors.newSingleThreadExecutor();
        //创建固定大小的线程池
//        ExecutorService es = Executors.newFixedThreadPool(2);
        //创建一个可缓存的线程池
        //       ExecutorService es = Executors.newCachedThreadPool();
        //创建一个大小无限的线程池
        ScheduledExecutorService es = Executors.newScheduledThreadPool(3);
        es.execute(new MyThread7());
        es.execute(new MyThread7());
        es.shutdown();//结束线程池
    }


    static class MyThread7 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}
