package com.study.base.api;

public class StringBufferDemo {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a + b + 1;
        System.out.print(c);

        String d = "a"+1+2+3+4+"b"; //a1234b 常量横加没有性能问题
        System.out.print("\n"+d);

        // StringBuffer的目的是用来解决字符串相加时带来的性能问提（编译期进行优化）
        // StringBuffer的内部实现采用字符数组，默认的额数组长度为16，超过数组大小时，动态扩充的算法是原来长度*2+2
        //所以当我们预知要添加数据的长度时，建议使用带初始值容量的构造方法，来避免动态扩充的次数，从而提高效率
        // 线程安全的，会影响性能
        StringBuffer sb = new StringBuffer(32); //  初始容量为16，带容量的构造
        sb.append(a).append(b).append(1);
        System.out.print(sb.toString());

        StringBuffer sb2 = new StringBuffer("abc");
    }
}
