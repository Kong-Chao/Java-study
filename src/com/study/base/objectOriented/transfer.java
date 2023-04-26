package com.study.base.objectOriented;

/**
 *  引用传递的本质是传递内存空间地址，而非值的本身，通过内存图充分理解占内存和堆内存
 */
public class transfer {
    public static void main(String[] args) {
        Duck d = new Duck(); //495
        method(d);
        System.out.println("Duck age:" + d.age);
    }

    public static void method(Duck duck){
        duck.age = 20; //495 地址值相同
    }
}

class Duck{
    int age = 10;
}
