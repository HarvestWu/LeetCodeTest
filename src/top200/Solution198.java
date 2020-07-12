package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 10:33
 **/
public class Solution198 {

    @Test
    public void test198() {
        int[] nums = {2, 7, 9, 3, 1};
        int result = rob(nums);
        System.out.println(result);
    }

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        int pre_1 = nums[0], pre_2 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            int tmp = pre_2;
            pre_2 = Math.max(pre_1 + nums[i], pre_2);
            pre_1 = tmp;
        }
        return pre_2;
    }
}
