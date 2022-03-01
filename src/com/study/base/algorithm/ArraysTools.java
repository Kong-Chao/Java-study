package com.study.base.algorithm;

import java.util.Arrays;

/**
 *  arrays工具类：用来操作数组的各种方法
 *  常用方法：
 *      使用二分查找 arrays。binarysearch（int[] array, int value）
 *      数组内容转成字符串的形式输出 arrays.toString(int[] array)
 *      数组排序： Arrays.sort(int[] array)
 *      复制指定的数组： Arrays.copyOf（int[] array, int length）
 *                  Arrays.copyOf(int[] array,int front, int to)
 *                  System.arraycopy(Object src, int srcPos,Object dest,int destPos,int length)
 *       判断两个数组是否相等 Arrays.equals()
 *       使用指定元素填充数组 Arrays.fill()
 *       arraycopy性能高于copyOf
 *
 */
public class ArraysTools {
    public static void main(String[] args) {
        int[] nums = {10,20,50,65,88,90};

        //二分查找 下标
        int search = Arrays.binarySearch(nums, 88);
        System.out.println(search);


        //输出数组
        for (int n : nums){
            System.out.println(n);
        }
        System.out.println(Arrays.toString(nums));

        int[] arrays ={18,12,33,4,92,60,55};
        Arrays.sort(arrays); //快速排序
        System.out.println(Arrays.toString(arrays));

        //复制数组
        int[] ints = Arrays.copyOf(arrays, 10);
        System.out.println(Arrays.toString(ints));

        int[] newNum = new int[arrays.length];
        System.arraycopy(arrays,0,newNum,0,arrays.length);
        System.out.println(Arrays.toString(newNum));

        /**
         * 数组的复制优先级：System.arraycopy->Arrays.copyOf->for
         */

        //两个数组是否相等
        System.out.println(Arrays.equals(arrays,newNum));

        //填充数组
        Arrays.fill(newNum,20);
        System.out.println(Arrays.toString(newNum));
    }
}
