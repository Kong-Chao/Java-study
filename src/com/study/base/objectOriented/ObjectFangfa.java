package com.study.base.objectOriented;

/**
 * Object
 * 一、equals()特性
 * 1.自反性
 * 2.对称性
 * 3.传递性
 * 4.一致性
 * 5.与null的比较
 *
 * 二、equals()与==
 * 对于基本类型 int、char..等,==判断两个值是否相等，基本类型没有equals()方法
 * 对于引用类型，==判断两个变量是否引用同一个对象，而equals()判断引用的对象是否等价
 *
 * 三、HashCode()
 *  hashCode()返回散列值，而equals用来判断两个对象是否等价。
 *  重点：等价的两个对象散列值一定相等，但是散列值相同的两个对象不一定等价
 *
 *  四、toString
 *  默认返回 ToStringExample@4554617c 这种形式，其中 @ 后面的数值为散列码的无符号十六进制表示。
 *
 *  五、clone()
 *  1. cloneable需要重写clone（）
 *  2.浅拷贝: 拷贝对象和原始对象的引用类型引用同一个对象。
 *  3.深拷贝： 拷贝对象和原始对象的引用类型引用不同对象。
 *  4.
 */
public class ObjectFangfa implements Cloneable{

    private int a = 1;

    private int b = 2;
    @Override
    protected ObjectFangfa clone() throws CloneNotSupportedException {
        return (ObjectFangfa)super.clone();
    }

    public static void main(String[] args) {
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        System.out.println(x.equals(y)); // true
        System.out.println(x == y); //false

        ObjectFangfa o1 = new ObjectFangfa();
        try{
            ObjectFangfa o2 =  o1.clone();
            System.out.println(o2);
            System.out.println(o2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
