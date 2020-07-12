package top1401to1600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 18:35
 **/
public class Solution1464 {

    @Test
    public void test1464() {
        int[] nums = {3, 4, 5, 2};
        int result = maxProduct(nums);
        System.out.println(result);
    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return (nums[len - 1] - 1) * (nums[len - 2] - 1);
    }

    public int maxProduct1(int[] nums) {
        int a = nums[0], b = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (a > b) {
                b = nums[i] > b ? nums[i] : b;
            } else {
                a = nums[i] > a ? nums[i] : a;
            }
        }
        return (a - 1) * (b - 1);
    }
}
