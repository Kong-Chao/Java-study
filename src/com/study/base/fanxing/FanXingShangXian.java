package com.study.base.fanxing;

/**
 * @author kc
 * @create 2023-04-27 21:16
 * 泛型的上限
 */
public class FanXingShangXian <T extends Number>{
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
        FanXingShangXian<Integer> i1 = new FanXingShangXian<Integer>() ;        // 声明Integer的泛型对象
    }
}
