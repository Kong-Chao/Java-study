package com.study.base.multithreading;

/**
 * 线程死锁
 * 过多的同步有可能出现死锁，死锁的操作一般是在程序运行时候才有可能出现
 */
public class ThreadDemo5 {
    public static void main(String[] args) {

        new DeadThread();
    }
}

//顾客
class Customer{
    public synchronized void say(Waiter w){
        System.out.println("顾客说，先吃饭后买单！");
        w.doService();
    }
    public synchronized void doService(){
        System.out.println("同意了，先买单后吃饭！！");
    }

}

//服务员
class Waiter{
    public synchronized void say(Customer c){
        System.out.println("服务员说，先买单在吃饭！！");
        c.doService();

    }
    public synchronized void doService(){
        System.out.println("同意了，吃完饭在买单！！");
    }
}

/**
 * 死锁线程
 */
class DeadThread implements  Runnable{
    Customer c = new Customer();
    Waiter w = new Waiter();

    public DeadThread(){
        new Thread(this).start();
        w.say(c);
    }

    @Override
    public void run() {
        c.say(w);
    }
}
