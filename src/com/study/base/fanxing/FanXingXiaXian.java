package com.study.base.fanxing;

/**
 * @author kc
 * @create 2023-04-27 21:21
 * 泛型下限
 */
public class FanXingXiaXian <T>{
    private T var ;        // 定义泛型变量
    public void setVar(T var){
        this.var = var ;
    }
    public T getVar(){
        return this.var ;
    }
    public String toString(){    // 直接打印
        return this.var.toString() ;
    }

    public static void main(String[] args) {
        FanXingXiaXian<String> i1 = new FanXingXiaXian<String>() ;        // 声明String的泛型对象
        FanXingXiaXian<Object> i2 = new FanXingXiaXian<Object>() ;        // 声明Object的泛型对象
        i1.setVar("hello") ;
        i2.setVar(new Object()) ;
        fun(i1) ;
        fun(i2) ;
    }

    public static void fun(FanXingXiaXian<? super String> temp){    // 只能接收String或Object类型的泛型，String类的父类只有Object类
        System.out.print(temp + ", ") ;
    }

}
