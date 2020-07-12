package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 16:43
 **/
public class Solution35 {

    @Test
    public void test35() {
        int[] nums = new int[]{1, 3, 5, 6};
        int result = searchInsert(nums, 7);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsert1(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
