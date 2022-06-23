package com.study.base.api;

import java.util.Arrays;

/**
 * 对象与对象之间的大小比较
 */
public class ArraysTest {
    public static void main(String[] args) {
         int[] nums ={34,56,23,11,10,99,100,55,90};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] num ={"大宝","Jack","菲菲","tom"};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        Cat[] cats = {new Cat("懒懒",1),new Cat("早早",2),new Cat("猫猫",4)};
       /* Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));*/ //报错.Cat cannot be cast to java.lang.Comparable ,
        // Cat需要实现Comparable<Cat>接口，重写compareTo（）方法是实现Comparable接口的使用（自然排序）规则：如果当前对象this大于形参对象obj，则返回正整数，
        // 如果当前对象this小于形参对象obj,则返回负整数。
        // 如果当前对象this等于形参对象obj,则返回零。

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        Dog[] dogs = {new Dog("懒懒",3),new Dog("早早",2),new Dog("猫猫",4)};
        Arrays.sort(dogs,new DogComparator());
        System.out.println(Arrays.toString(dogs));
    }
}
