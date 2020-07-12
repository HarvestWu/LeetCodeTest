package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-11 22:23
 **/
public class Solution303 {

    @Test
    public void test303() {
        int[] nums = {1, 2, 3, 4, 5};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(1, 2));
        System.out.println(numArray.sumRange(2, 3));
    }

    static class NumArray {

        private int[] sum;

        public NumArray(int[] nums) {
            sum = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                sum[i + 1] = sum[i] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            return sum[j + 1] - sum[i];
        }
    }
}
