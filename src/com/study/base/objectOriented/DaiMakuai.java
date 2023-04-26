package com.study.base.objectOriented;

/**
 * 代码块
 * 1.普通代码块，在方法中写的代码块
 * 2.构造快，在类中定义的代码块
 * 3.在类中使用static声明的代码块为静态代码块
 *      在第一次使用的时候被调用（创建对象），只会执行一次，优于构造快执行
 *      在项目开发中，通常使用静态代码块来初始化只调用一次的数据
 *      小结：重点会使用的是静态代码块、普通代码块、同步代码块
 */
public class DaiMakuai {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
    }

}

class Student{
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块");
    }
    public Student(){
        System.out.println("构造方法");
    }
    void study(){
        {
            int i =10;
            System.out.println("普通代码块");
        }
    }
}
