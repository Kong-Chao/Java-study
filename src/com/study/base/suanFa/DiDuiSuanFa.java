package com.study.base.suanFa;

/**
 * 在链表数据结构中，递归算法是一种直接或间接地调用自身算法的过程，解决编程中一大类问题很有效，且描述简洁便于理解
 */
public class DiDuiSuanFa {
    public static void main(String[] args) {
        int result = jiecheng2(100);
        System.out.println(result);
    }

    //递归算法，方法本身调用自己
    //1.递归必须要有出口
    //2.递归消耗内存大，容易发生内存溢出
    //3.层次调用越多，越危险
    public static int jiecheng2(int num){
        if (num ==1) return 1;
        return  num * jiecheng2(num - 1);
    }

    public static int jiecheng1(int num){
        int result = num;
        int i = num-1;
        do{
            result = result * i;
            i --;
        }while (i > 1);

        return result;
    }
}
