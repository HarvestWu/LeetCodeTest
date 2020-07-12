package top1201to1400;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 20:17
 **/
public class Solution1365 {

    @Test
    public void test1365() {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] table = new int[101];
        int[] result = new int[nums.length];
        for (int n : nums) {
            table[n]++;
        }
        for (int i = 1; i < table.length; i++) {
            table[i] += table[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] == 0 ? 0 : table[nums[i] - 1];
        }
        return result;
    }
}
