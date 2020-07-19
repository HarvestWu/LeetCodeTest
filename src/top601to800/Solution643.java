package top601to800;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-19 17:34
 **/
public class Solution643 {

    @Test
    public void test643() {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k-1) {
                max = Math.max(max, sum);
                sum -= nums[i - k+1];
            }
        }
        return (double) max / k;
    }
}
