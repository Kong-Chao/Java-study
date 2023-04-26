package com.study.base.thread;

import lombok.Data;

/**
 * 生产者与消费者应用案例
 * 两个线程协同工作，先生产在消费
 * 面试题：
 * sleep与waiter区别：
 * sleep：让线程进入休眠状态，让出CPU时间片，不释放对象监视器的所有权（对象锁）
 * waiter：让线程进入等待状态，让出CPU时间片，释放对象监视器的所有权（对象锁），等待其他线程通过notify 唤醒
 */

public class ThreadDemo6 {
    public static void main(String[] args) {
        Food food = new Food();
        Producter p = new Producter(food);
        Customers c = new Customers(food);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

/**
 * 消费者
 */
class Customers implements Runnable{
    private Food food;

    public Customers(Food food){
        this.food = food;
    }

    @Override
    public void run() {
        for (int i=0;i<20 ;i++){
            food.get();
        }
    }
}

/**
 * 生产者
 */
class  Producter implements Runnable{
    private Food food;

    public Producter(Food food){
        this.food = food;
    }

    @Override
    public void run() {
        for (int i=0;i<20 ;i++){
            if (i % 2==0){
                food.set("锅包肉","咸口味");
            }else {
                food.set("佛跳墙","大补，补脑");
            }
        }
    }
}


@Data
class Food {
    private  String name;
    private  String describe;

    private boolean flag = true;  //true标识可以生产，false表示可以消费

// 生产产品
    public synchronized void set(String name, String describe){
//        不能生产
        if (!flag){
            try {
                this.wait(); // 线程进入等待状态，释放监视器的所有权（对象锁）
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.setName(name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setDescribe(describe);
        flag = false;
        this.notify();// 唤醒等待的线程，随机其中一个
    }

//    消费产品
    public synchronized void get(){
        // 不能消费
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.getName() + "->" + this.getDescribe());
        flag = true;
        this.notify(); //唤醒线程
    }

    public Food(){

    }

    public Food(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }
}

