package org.zicheng.stu.sort;


import java.util.Arrays;

/**
 * 选择排序事件复杂度为 n^2
 * 每次选出一个最小的数交换位置
 * Author: zicheng
 * Since: 2020-09-19 11:25
 */

public class SelectSort {

    public static int[] sort(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            index = i + 1;
            for (int j = index + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }

            if (nums[i] > nums[index]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }

        }

        return nums;

    }

    public static void main(String[] args) {

        int[] nums = {11,34,98,23,65,34,87,56,98,12};
        System.out.println(Arrays.toString(SelectSort.sort(nums)));

    }
}
