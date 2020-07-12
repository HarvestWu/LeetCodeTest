package top1401to1600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 14:37
 **/
public class Solution1480 {

    @Test
    public void test1480() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        result[0] = nums[0];
        for (int i = 1; i < len; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
