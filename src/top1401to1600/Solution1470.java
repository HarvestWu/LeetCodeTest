package top1401to1600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:09
 **/
public class Solution1470 {

    @Test
    public void test1470() {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            result[p++] = nums[i];
            result[p++] = nums[n + i];
        }
        return result;
    }
}
