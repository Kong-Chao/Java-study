package com.study.base.day1;

/**
 *  方法可以理解为一种抽象思维。把需要重复使用的diamagnetic收取出来定义，必要的时候可以通过调用俩使用，避免了
 *  代码重复（函数）
 */
public class Main {

    //public 访问权限修饰符
    //static 静态修饰符，描述的方法直接调用
    // void 返回值（无返回值）
    // getMenu 方法名
    public static void  getMenu(){
        System.out.println("菜单");
        System.out.println("鸡蛋");
        System.out.println("面条");
        System.out.println("牛肉");
        System.out.println("汤");
    }
    public static void main(String[] args) {
	// write your code here

        getMenu();

    }


}
