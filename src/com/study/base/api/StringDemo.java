package com.study.base.api;

/**
 * String 表示一个字符串，内部使用字符串数组实现，不能被继承（最终类），且不可变
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "粪粪";   //使用第一种赋值
        String s2 = new String("粪粪"); //使用new关键字创建对象，new表示申请内存空间
        String s3 = "粪粪";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        //代码示例：4钟情况，直接赋值字符串连接时，考虑编译期和运行期
        // 如果在编译期可以确定，那么就是用已有对象，否则会创建新的对象
        String a = "a";
        String a1 = a +1;
        String a2 = "a1";
        System.out.println(a1 == a2);

        final String b = "b";
        String b1 = b + "1";
        String b2 = "b1";
        System.out.println(b1 == b2);

        String c = getC();
        String c1 = c+1;
        String c2 = "c1";
        System.out.println(c1 == c2);
    }

    private static String getC(){
        return "c";
    }
}
