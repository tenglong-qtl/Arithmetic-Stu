package org.zicheng.stu.test;

import java.util.Arrays;

/**
 * Author: T.L. QIU
 * Date: 2020-09-22 15:51.
 */
public class Test {

    public static int findMaxValue(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        return max;
    }

    public static void test(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            // ...
        }
    }

    public static void main(String[] args) {
        int[] nums = {11,54,2,5,98,56,445,12,989,6};
        System.out.println(Test.findMaxValue(nums));
    }
}
