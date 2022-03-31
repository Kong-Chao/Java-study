package com.study.base.exception;

/**
 * 自定义异常通常用于通过继承一个异常来实现,自定义异常的是现实是重写父类的构造方法，异常对象本身没实际功能，只有一个有意义的标识
 * 1.Throwable
 * 2.Exception
 * 3.RuntimeException
 */
public class MyException extends Exception{
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }
}
