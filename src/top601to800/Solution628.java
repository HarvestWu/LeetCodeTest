package top601to800;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-19 16:24
 **/
public class Solution628 {

    @Test
    public void test() {
        int[] nums = {-4,-3,-2,-1,60};
        System.out.println(maximumProduct(nums));
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 3] * nums[len - 2] * nums[len - 1]);
    }

    int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
    int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

    public int maximumProduct1(int[] nums) {
        for (int num : nums) {
            get(num);
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public void get(int n) {
        if (n <= min1) {
            min2 = min1;
            min1 = n;
        } else if (n <= min2) {
            min2 = n;
        }
        if (n >= max1) {
            max3 = max2;
            max2 = max1;
            max1 = n;
        } else if (n >= max2) {
            max3 = max2;
            max2 = n;
        } else if (n >= max3) {
            max3 = n;
        }
    }
}
