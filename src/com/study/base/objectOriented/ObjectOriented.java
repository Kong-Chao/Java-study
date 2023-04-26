package com.study.base.objectOriented;

/**
 * 面向过程：以步骤为单位，一步一步完成某一个具体事情
 * 面向对象： 以对象为单位，通过调度组合不同的对象来完成某一个事情
 */
public class ObjectOriented {
    public static void main(String[] args) {
        Horse horse =new Horse();
        horse.name ="千里马";
        horse.age = 10;
        horse.run(); //调用run方法
        horse.eat();

        //匿名对象类: 只能使用一次，使用完后该对象就会被释放
        new Horse().eat();
        horse = null; //把对象释放
//        horse.eat();//  当对象不存在时，调用该对象属性和方法爆错（空指针）

    }
}

//自定义一个类（类型）
class Horse{
    //在类中定义属性（特征）
    String name;
    int age;
    public void run(){
        System.out.println("我是："+name +",我" + age +"岁了，还在日行千里");
    }
    public void eat(){
        System.out.println("我吃仙草，还吃苹果");
    }
}
