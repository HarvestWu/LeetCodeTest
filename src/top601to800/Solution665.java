package top601to800;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 12:09
 **/
public class Solution665 {

    @Test
    public void test665() {
        int[] nums = {4, 2, 1};
        System.out.println(checkPossibility(nums));
    }

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length && count <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (i - 2 >= 0 && (nums[i - 2] > nums[i])) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i - 1] = nums[i];
                }
            }
        }
        return count <= 1;
    }
}
