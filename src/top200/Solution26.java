package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 16:03
 **/
public class Solution26 {

    @Test
    public void test26() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 0, len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[result]) {
                nums[++result] = nums[i];
            }
        }
        return result + 1;
    }
}
