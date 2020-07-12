package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 16:12
 **/
public class Solution27 {

    @Test
    public void test27() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int result = removeElement(nums, 2);
        System.out.println(result);

    }

    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                result++;
            } else {
                nums[i - result] = nums[i];
            }
        }
        return nums.length - result;
    }
}
