package com.study.base.suanFa;

/**
 * Java数组的定义：一组能够存储相同数据类型值的变量的集合，具有存取效率高
 *
 * 数组赋值方法：1.使用默认的初始值来初始化数组中的每一个元素
 *          2.先声明，再赋予默认的初始值
 *          3.先声明，指定的值进行初始化
 *          4.使用数组常量值给数组进行赋值
 */

public class ShuZu {
    public static void main(String[] args) {
        //第一种
        int[] nums = new int[5];
      /*  nums[0] =1;
        nums[1] =2;
        nums[2] =3;
        nums[3] =4;
        nums[4] =5;*/
        for (int i=0;i <5;i++){
            nums[i] = i +1;
        }

        //第二种
        int nums2[];
        nums2 = new int[5];

        //第三种
        int[] nums3 = new int[]{1,2,3,4,5};

        int[] nums4 = {1,2,3,4,5};
    }
}
