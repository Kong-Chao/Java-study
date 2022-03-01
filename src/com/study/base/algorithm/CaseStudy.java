package com.study.base.algorithm;

import java.time.chrono.IsoChronology;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *  模拟双色球的综合案例
 *  1.用户选择是机选还是手选号码
 *  2.接收用户选号（6红 ： 1蓝）
 *  3.生成系统号码（6 红 ： 1 蓝）
 *  4.比较系统号码和用户号码，记录个数
 *  5.验证是否中奖
 *  6.系统号码排序
 *  7.公布结果
 */
public class CaseStudy {
    public static void main(String[] args) {
        //定义相关的变量
        int[] userRedBall = new int[6]; //用户选择的红色号码
        int[] sysRedBall = new int[6]; //系统生成的红色球号码
        int userBlueBall =0 ;  //用户选择的蓝球
        int sysBlueBall =0 ; //系统生成的蓝球
        int blueCount =0 ; //记录用户选择正确的蓝球数
        int redCount =0 ; //记录用户选择正确的红球数
        int[] redBall = new int[33]; //用于存储1--33的红色号码
        //需要随机生成6个在1-33之间不重复的数（算法）
        for (int i=0; i< redBall.length; i++){
            redBall[i] = i + 1;
        }

        //游戏开始，系统提示
        System.out.println("双色球游戏开始：good luck！");
        System.out.println("请问你是选择机选或是手选号码（1：机选 ，2： 手选）：");
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        boolean flag = true;
        while (flag){
            int isAuto = input.nextInt();
            switch (isAuto){
                case 1:
                    //机选
                    computerSelection(redBall,userRedBall); //机选
                    userBlueBall = r.nextInt(16) +1; //机选蓝球
                    flag =false;
                    break;
                case 2 :
                    //手选
                    System.out.println("请选择6个红色球号码（1-13）：");
                    for (int i =0 ;i<userRedBall.length ;i++){
                        userRedBall[i] = input.nextInt();
                    }
                    System.out.println("请选择1个蓝球号码（1-16）：");
                    userBlueBall = input.nextInt();
                    flag =false;
                    break;
                default:
                    System.out.println("请问你是选择机选或是手选号码（1：机选 ，2： 手选）：");
                    break;
            }
        }

        //系统随机生成号码
        //红球
        computerSelection(redBall,sysRedBall);
        //蓝球
        sysBlueBall = r.nextInt(16) +1;

        //统计结果：
        //红球
        for (int i =0; i< userRedBall.length; i++){
            for (int j=0; j< sysRedBall.length -redCount; j++){
                if (userRedBall[i] == sysRedBall[j]){
                    int temp = sysRedBall[j] ;
                    sysRedBall[j]  = sysRedBall[sysRedBall.length -1-redCount];
                    sysRedBall[sysRedBall.length -i-redCount] =temp;
                    redCount ++;
                    break;
                }
            }
        }

        //统计篮球
        if (userBlueBall == sysBlueBall){
            blueCount = 1;
        }

        //验证是否冲突
        if (blueCount == 0 && redCount <= 3){
            System.out.println("未成功");
        }else if (blueCount ==1 && redCount <3){
            System.out.println("中了，5块钱");
        }else if ((blueCount ==1 && redCount ==3) || (blueCount == 0 && redCount ==4)){
            System.out.println("10 $ ");
        }else if ((blueCount ==1 && redCount == 4) || (blueCount ==0 && redCount == 5)){
            System.out.println("200 $ ");
        }else if (blueCount ==1 && redCount == 5){
            System.out.println("2000 $ ");
        }else if (blueCount ==0 && redCount == 6){
            System.out.println("20000 $ ");
        }else if (blueCount ==1 && redCount == 6){
            System.out.println("200000 $ ");
        }else {
            System.out.println("系统有误，中将无效！");
        }

        //公布系统号码
        System.out.println("本期中将红色号码为：");
        sort(sysRedBall);
        System.out.println(Arrays.toString(sysRedBall));
        System.out.println("本期中将蓝色号码为：" +sysBlueBall);

        //公布用户号码
        System.out.println("你选择的红色号码为：");
        sort(userRedBall);
        System.out.println(Arrays.toString(userRedBall));
        System.out.println("你选择的蓝色号码为：" +userBlueBall);

        System.out.println("买双色球，造福你我，谢谢参与");
    }

    //冒泡排序
    public static  void sort(int [] ball){
        for (int i =0; i<ball.length-1 ;i++){
            for (int j=0;j<ball.length-1-i; j++){
                if (ball[j] >ball[j+1]){
                    ball[j] =ball[j] + ball[j+1];
                    ball[j+1] = ball[j] -ball[j +1];
                    ball[j] = ball[j]-ball[j+1];
                }
            }
        }
    }

    //用于在指定数列中，随机生成多个不重复的数算法--例子重点（可用于其他场景）
    public static void computerSelection(int[] redBall ,int[] userRedBall){
        Random r = new Random();
        int index = -1;
        for (int i =0 ;i < userRedBall.length; i++){
            index = r.nextInt(redBall.length - i);
            userRedBall[i] = redBall[index];
            int temp = redBall[index];
            redBall[index] = redBall[redBall.length -1-i];
            redBall[redBall.length -1-i] = temp ;
        }
    }
}
