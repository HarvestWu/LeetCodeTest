package top401to600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-17 21:53
 **/
public class Solution561 {

    @Test
    public void test561() {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
