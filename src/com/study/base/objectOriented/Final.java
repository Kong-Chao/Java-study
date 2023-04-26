package com.study.base.objectOriented;

/**
 *  final关键字
 *  1.使用final声明一个属性，就是常量，常量的命名规则建议使用全大写,常量必须在定义时或在构造器中初始化
 *  2.使用final声明的方法，不能被子类中重写，只能被继承
 *  3.使用final关键字声明一个类，该类就转变为一个最终类，没有子类的类，final修饰的类无法被继承
 */
public class Final {
    public static void main(String[] args) {
    FinalClass fc = new FinalClass();
    fc.setLength(6);
    }
}

//常用工具类：在实际的项目开发中，常用类通常用于定义项目中一些公共的，不变的数据
class Constant{
    public static final int  PERSON_NUM =10;
}

class FinalClass{
    public final int DAY_NUMBER; //工作天数

    public FinalClass(){
        DAY_NUMBER = 22;
    }
    public final void print(){
        System.out.println("这是一个final方法");
    }
    public void setLength(int size){
        size ++;
        System.out.println(size);
    }
}

class SubClass extends FinalClass{
   /* public void print(){
        System.out.println("这是一个final方法");
    }*/
}
