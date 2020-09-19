package org.zicheng.stu.search;

/**
 * Author: zicheng
 * Since: 2020-09-19 11:25
 * Description:
 *  二分查找的关键在于 low <= hight
 */
public class BinarySearch {

    public int find(int[] nums, int targrt) {
        int low = 0;
        int hight = nums.length;

        while (low <= hight) {
            int mid = (low + hight) / 2;
            if (nums[mid] < targrt) {
                low = mid + 1;
            } else if (nums[mid] > targrt) {
                hight = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5, 8, 9, 10, 35, 57, 67, 89};
        System.out.println(binarySearch.find(nums, 89));
    }
}
