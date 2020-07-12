package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 18:19
 **/
public class Solution204 {

    @Test
    public void test204() {
        int n = 10;
        int result = countPrimes(n);
        System.out.println(result);
    }

    public int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        int[] nums = new int[n];
        nums[0] = nums[1] = 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            for (int j = 2; i * j < n; ++j) {
                nums[i * j] = 1;
            }
        }
        int count = 0;
        for (int t : nums) {
            count += t == 0 ? 1 : 0;
        }
        return count;
    }
}
