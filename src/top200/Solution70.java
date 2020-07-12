package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-05 14:58
 **/
public class Solution70 {

    @Test
    public void test70() {
        int n = 5;
        int result = climbStairs(n);
        System.out.println(result);
    }

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1, b = 2, result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}
