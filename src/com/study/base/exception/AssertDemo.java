package com.study.base.exception;

/**
 * assert  关键字，标识断言,代码调试启用，添加vm参数 -ea,断言才启用
 * Java中断言有两种语法
 * assert 布尔表达式；
 * assert 布尔表达式 ：“错误信息提示”；
 */
public class AssertDemo {
    public static void main(String[] args) {
        int result = add(10,10);
        assert  result == 20 :"结果不正确";
    }
    private static int add(int a,int b){
        return a + b +1;
    }
}
