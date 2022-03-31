package com.study.base.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1.Throwable是异常的基类，分为Error和Exception，在编程过程中关注Exception
 * 2.Exception分为编译期异常（受检）和运行期异常（非受检）RuntimeException
 * 3.异常会导致程序中断，无法继续运行
 * 4.在开发中，我们需要把可能会出现异常的代码使用try语句包裹起来
 * 5.处理异常可以让程序保持运行状态
 * 6.catch可以有多个，顺序为从子类到父类，大的放后面，小的放前面
 *
 *
 * /**ThrowAndThrows
 *  * 1.throws关键字主要在方法的声明上使用，表示方法中不做处理异常，而交给调用处处理，实际上对Java程序来讲，如果没有加入任何处理异常，默认为jvm进行异常的处理操作。
 *  * 2.throw 关键字表示在程序中手动抛出一个异常，因为从异常处理的机制来看，所有的异常一旦产生之后，实际上抛出的就是一个异常类的实例化对象，那么此对象也可以由throw直接抛出
 *  */

public class ExceptionDemo {
    public static void main(String[] args) {
       // div(10,2);
       // method();
        /*try {
            div2(10,2);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("over");*/
        input();
    }

    /**
     * 除法运算
     * @param num1
     * @param num2
     */
    public static void div(int num1,int num2){
        int[] arr = {1,2,2,3,4,5};
        try {

            System.out.println(arr[5]);
            arr = null;
            System.out.println(arr.length);
            double result = num1/num2;
            System.out.println("result="  +result);
        }catch (ArithmeticException e){ //数学算数异常
            System.out.println("除数不能为0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界了");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("戳错了");
        }finally {
            System.out.println("执行程序完毕");
        }

        System.out.println("程序结束");
    }

    private static int method(){
        int a = 10;
        int b= 5;
        try {
            System.out.println("a=" +a);
            System.out.println("b=" +b);
            int c= a / b;
            System.out.println("a/b=" +c);
            return c;
        }catch (Exception e){
            //代码调试时使用
            e.printStackTrace();
        }finally {
            System.out.println("finally.");
        }
        return -1;
    }

    private static int div2(int a, int b)throws ArithmeticException{
        try {
            int c = a/b;
            return c;
        }catch (ArithmeticException e){
            throw  new ArithmeticException("除数不能0");
        }finally {
            System.out.println("程序结束");
        }
    }

    public static void input(){
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
            System.out.println("输入不匹配");
        }
    }
}
