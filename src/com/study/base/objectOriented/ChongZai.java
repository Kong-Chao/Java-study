package com.study.base.objectOriented;

/**
 * 重载：在一个类中，具有相同的方法名， 参数列表不同（参数的个数及类型/顺序不同），与返回值无关
 */
public class ChongZai {
    //定义一个学习方法
    public static void study() {
    }
    //定义学习方法并传入String类型的name
    public static void study(String name) {
    }
    //定义学习方法并传入int类型的age
    public static void study(int age) {

    }
    //定义学习方法并传入String类型的name和int类型age
    public static void study(String name, int age) {
    }
    //public static int study(String name, int age){
    //}; //方法报错 因为方法重载与返回值类型无关

    //定义学习方法并传入String类型的name和int类型age以及String类型的性别
    public static void study(String name, int age, String sex) {
    }
    //与上面相同方法和相同参数，但是参数顺序不一样
    public static void study(int age, String name, String sex) {
    }

}
