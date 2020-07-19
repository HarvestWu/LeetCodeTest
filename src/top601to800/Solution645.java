package top601to800;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-19 17:46
 **/
public class Solution645 {

    @Test
    public void test645() {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public int[] findErrorNums(int[] nums) {
        int dup = 0, missing = 0;
        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                dup = i;
            }
        }
        return new int[]{dup, missing};
    }

    public int[] findErrorNums1(int[] nums) {
        Arrays.sort(nums);
        int dup = 0, missing = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                dup = nums[i];
            } else if (nums[i + 1] - nums[i] == 2) {
                missing = nums[i] + 1;
            }
        }
        return new int[]{dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }
}
