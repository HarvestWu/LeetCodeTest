package top601to800;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 11:16
 **/
public class Solution704 {

    @Test
    public void test704() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        assertEquals(4, search(nums, target));

    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }
}
