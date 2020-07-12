package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 20:03
 **/
public class Solution136 {

    @Test
    public void test136() {
        int[] nums = {1, 2, 3, 4, 3, 2, 1};
        int result = singleNumber(nums);
        System.out.println(result);
    }


    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
