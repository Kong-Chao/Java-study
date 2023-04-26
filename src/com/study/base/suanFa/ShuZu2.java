package com.study.base.suanFa;

/**
 * 数组的遍历：内存结构理解，jvm内存结构的核心模块
 */
public class ShuZu2 {
    public static void main(String[] args) {
        int[] sources = {20, 45, 90, 90, 88};

        //for循环遍历
        for (int i=0;i < sources.length; i++){
            int source = sources[i];
            System.out.println(source);
        }
        System.out.println(sources);

        //forearch 增强for循环
        //语法：for（数组中元素的类型 变量名（随意） ：数组名）{数组中的元素类型 临时变量 =变量 }
        for (int x:sources){
            System.out.println(x);
        }

        System.out.println("...................///");
        //调用方法
//        print(sources);
        print1(sources);

    }

    public static void print(int[] x){
        int length = x.length;
        for (int i =0;i< length;i++){
            System.out.println(x[i]);
        }
    }

    //jdk1.5  可变参数
    //可变参数只能是参数列表中的最后一个
    //可变参数作为数组使用
    public static void print1(int... x){
        int length = x.length;
        for (int i =0;i< length;i++){
            System.out.println(x[i]);}
    }
}
