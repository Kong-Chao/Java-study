package com.study.base.algorithm;

/**
 * 二分法查找（折半查找）：前提是已经拍好顺序的数组中；
 *      通过将待查找的元素与中间索引值对应的元素的进行比较，若大于中间索引值对应的元素，去右半部分查找；否则，去左半部分查找
 *      以此类推，直到找到为止：找不到返回一个负数。
 */
public class BinarySearch {
    public static void main(String[] args) {
        //必须保证数列有序
        int[] nums = {10,20,50,65,88,90};
        int index = binarySearch(nums,88);
        System.out.println(index);
    }

    //二分查找算法
    public static int binarySearch(int[] nums,int key){
        int start = 0; //开始下标
        int end = nums.length-1; //结束下表
        while (start <= end){
            int middle = (start + end)/2; //  >>>1
            if (nums[middle] > key){
                start =middle + 1;
            }else if (nums[middle] < key){
                end = middle -1;
            }else {
                return  middle;
            }
        }
        return -1;
    }
}
