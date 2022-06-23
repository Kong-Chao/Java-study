package com.study.base.method;

import java.util.Scanner;

/**
 * 方法的返回值（重点知识知识概念）
 *      return 结束方法的返回值，就是功能的结果，return带给调用者
 *      注意：1.若当前的方法没有返回值类型，即返回值类型是void，当前方法中没有return
 *      2.return 表示一个方法的结束，可以将返回值回调给当前的方法调用者
 *      3.return 返回值只能返回一个值，不可以反悔多个值
 *      4.一个方法中可有多个return，但是被执行的只有一个，所以需要判断
 */
public class Test1 {
    //1.练习题：判断任意给定的年份是否是是闰年
    public static void main(String[] args) {
        //调用isRunYear
        Scanner scanner =new Scanner(System.in);
        //输入年份
        Integer sys = scanner.nextInt();
        System.out.println("年份输入为：" +sys);
        boolean aBoolean =  isRunYear(sys);
        if(aBoolean){
            System.out.println("闰年");
        }else {
            System.out.println("ping年");
        }
    }
    public  static Boolean isRunYear(int year){
        if ((year %4 ==0 && year %100 !=0) || year %400 ==0){
            return true;
        }
        else {
            return false;
        }
    }
}
