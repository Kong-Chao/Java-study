package com.study.base.day1;

import java.util.Scanner;

/**
 * 练习题2：根据传入的参数打印三角形
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printTriangle(num);

        System.out.println("结果是：" + add(10,20));
    }

    public static void printTriangle(int line){
        //外循环控制行数
        for (int i=1;i <=line;i++){
                //内循环输出空格
                for (int j= i;j <line; j++){
                    System.out.println(" ");
                }
                for (int  j=1; j<= i*2-1 ; j++){
                    System.out.println("*");
                }
         System.out.println();
            }
        }

    //方法的重载 : 方法名可以相同，传入类型、参数不同。
    public static int add(int a, int b){
        return  a + b;
    }

    public static float add(float a, int b){
        return  a + b;
    }
}

