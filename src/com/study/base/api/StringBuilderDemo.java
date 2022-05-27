package com.study.base.api;



/**
 * StringBuilder:一个可变的字符序列，此类提供了一个与String Buffer兼容的api,但是不能保证同步。该类被设计用作String buffer的一个简易替换
 * 用在字符串缓冲区被单个线程使用的时候（这种情况很普遍）。如果可能，建议优先采用该类，因为大多数实现中，它比String buffer要快
 * 字符串相加原理
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //面试题：String buffer与String Builder的区别？
        //String buffer是线程安全的的，性能低。
        //String builder是线程不安全的，性能高，适合在单线程中使用，这种情况占大多数，在jdk1.5中后添加
        StringBuilder str = new StringBuilder();

        //字符串相加操作
        //1.多个常量相加没有性能问题，在编译期优化
        //2.变量与常量相加，会产生多个垃圾对象
        String a = "a"+ 1;
        String b=   a+ "b";

        String c = null;
        for (int i = 0;i<5;i++){
            c += i; // 每次循环会产生一个String builder对象实现拼接，性能低，最好是手动创建String Builder来拼接
        }
        //1.字符串相加，在编译后，会使用String builder来优化代码，实现拼接
    }
}
