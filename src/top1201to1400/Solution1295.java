package top1201to1400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 19:52
 **/
public class Solution1295 {

    @Test
    public void test1295() {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int t : nums) {
            String str = String.valueOf(t);
            if (str.length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public int findNumbers1(int[] nums) {
        int result = 0;
        for (int t : nums) {
            if ((int) (Math.log10(t) + 1) % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
