package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 17:30
 **/
public class Solution53 {

    @Test
    public void test53() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    public int maxSubArray(int[] nums) {
        int result = nums[0], sum = 0;
        for (int n : nums) {
            if (sum > 0) {
                sum += n;
            } else {
                sum = n;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}
