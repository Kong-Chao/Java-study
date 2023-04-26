package com.study.base.thread;

/**
 * 线程休眠
 * join方法的主要作用就是-同步，它可以使线程之间的并行执行变为串行执行
 * 中断线程：
 *      （1）使用interrupt方法来中断线程，在设置设置一个中断状态（标记）
 *      （2）自定义标记的方法（推荐使用）
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyRunable2 mr2 = new MyRunable2();
        Thread t = new Thread(mr2);
//        t.start();

        MyRunable3 mr3 = new MyRunable3();
        Thread t2 = new Thread(mr3);
        t2.start();

        for (int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"--" +i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==20){
//                try {
//                    t.join();  //让t线程执行完毕
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }

//                t.interrupt(); //中断线程，只是做一个终端标记

                mr3.flag = false;

            }
        }

    }
}

class MyRunable2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<50; i++){
            if (Thread.interrupted()){ //测试中断线程，此方法将会把中断状态清楚

                break;
            }
            System.out.println(Thread.currentThread().getName()+"--" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }

    }
}

class MyRunable3 implements Runnable{
    public boolean flag =true;
    public MyRunable3(){
        flag = true;
    }

    @Override
    public void run() {
        int i= 0;
        while (flag){

            System.out.println(Thread.currentThread().getName()+"===" + (i++));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
