package org.zicheng.stu.recursion;

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
     *  最后一个数是1，作为基线条件
     *  数值的变化规律为递减1，所以参数递减
     *  数值之间规律为*，所以方法体使用了*来联系遍历与方法
     */
    public static int factorial(int num) {
        if (num == 1)
            return num;
        return num * factorial(num - 1);

    }

    public static void main(String[] args) {
        System.out.println(RecursionTest.factorial(5));
    }

}
