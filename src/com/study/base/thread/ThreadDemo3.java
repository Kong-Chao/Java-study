package com.study.base.thread;

/**
 * 守护线程与yield
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyRunable4 mr4 = new MyRunable4();
        Thread t = new Thread(mr4);
        t.setName("Thread-t");
        // 优先级高可以提高该线程抢占CPU时间片的概率大
        t.setPriority(Thread.MAX_PRIORITY);
        // 线程可以分为守护线程和用户线程， 当进程中没有用户线程时，jvm会退出
        t.setDaemon(true); //把该线程设置为守护线程
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        for (int i =0; i < 50;i++){
            System.out.println("mian--" + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i ==5 ){
                Thread.yield(); // 让出本次CPU执行时间片
            }
        }
        }
}

class MyRunable4 implements Runnable{
    @Override //重写：子类对父类的允许访问的方法的实现进行重新编写，返回值和形参都不能改变
    //@Overload 重载：在一个类里面，方法名字相同，然而参数不同。返回类型可以相同也可以不同
    public void run() {
        for (int i=0; i<50 ;i++){
            System.out.println("--" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
