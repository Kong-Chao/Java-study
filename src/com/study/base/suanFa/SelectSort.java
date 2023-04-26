package com.study.base.suanFa;

/**
 * 选择排序：数据规模越小越好，好处是不占用额外的内存空间
 * 概念：每一趟从待排序的数据元素中取出最大（或最小）的一个元素，顺序放在已经拍好顺序的数列的最后，直到全部待排序的数据元素排完，选择排序是不稳定的排序方法
 */
public class SelectSort {
    public static void main(String[] args) {
        int nums[] = {34 ,4,56,56,17,90,65}; //待排序的数列
        int minIndex =0; //用于记录每次比较的最小值下标
        for (int i =0; i< nums.length-1 ;i++){
            minIndex =i ;
            for (int j =i+1; j <nums.length; j++){
                if (nums[minIndex]>nums[j]){
                    minIndex =j;
                }
            }
            if (minIndex !=i){
                nums[minIndex] = nums[minIndex] +nums[i];
                nums[i] = nums[minIndex] -nums[i];
                nums[minIndex] = nums[minIndex]-nums[i];
            }
        }

        //
        for (int n: nums){
            System.out.println(n);
        }
    }
}

/**
 * 34 ,4,56,56,17,90,65
 * 4 34 56 56 17 90 65  5次
 * 4 17 56 56 34 90 65 4次
 * 4 17 34 56 56 90 65 3次
 * 4 17 34 56 56 90 65 2次
 * 4 17 34 56 56 65 90 1次
 *
 */
