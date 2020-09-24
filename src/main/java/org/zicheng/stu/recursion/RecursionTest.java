package org.zicheng.stu.recursion;

import java.util.Arrays;

/**
 * 递归必须要基线条件，否则一直调用下去
 * 基线条件：判断退出的条件
 * Author: T.L. QIU
 * Date: 2020-09-23 17:39.
 */
public class RecursionTest {

    /**
     * 5! = 5 * 4 * 3 * 2 * 1
     * 基线条件：num = 1
     * 最后一个数是1，作为基线条件
     * 数值的变化规律为递减1，所以参数递减
     * 数值之间规律为*，所以方法体使用了*来联系遍历与方法
     */
    public static int factorial(int num) {
        if (num == 1)
            return num;
        return num * factorial(num - 1);

    }

    /**
     * sum = 1 + 5 + 3 + 4 + 5
     * 基线条件：len = 1
     * 关系： +
     * 规律： 数组中都有这些元素，每次递减一个就行
     * 时间复杂度： n
     * 空间复杂度： n^2
     */
    public static int sum(int[] nums){
        if (nums.length == 1)
            return nums[0];
        else
            return nums[0] + sum(Arrays.copyOfRange(nums,1,nums.length));
    }

    /**
     * sum = 1 + 5 + 3 + 4 + 5
     * 基线条件：index = len - 1
     * 关系： +
     * 规律： index + 1
     * 时间复杂度： n
     * 空间复杂度： n
     */
    public static int sum2(int[] nums,int index){
        if (nums.length - 1 == index)
            return nums[index];
        else
            return nums[index] + sum2(nums,index+1);
    }

    public static void main(String[] args) {
        // System.out.println(RecursionTest.factorial(5));
        int[] nums = {1,2,3,4,5};
        System.out.println(RecursionTest.sum2(nums,0));
    }

}
