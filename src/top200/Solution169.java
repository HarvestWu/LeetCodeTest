package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 23:16
 **/
public class Solution169 {

    @Test
    public void test169() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int n : nums) {
            if (count == 0) {
                candidate = n;
            }
            count += candidate == n ? +1 : -1;
        }
        return candidate;
    }
}
