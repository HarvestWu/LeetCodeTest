package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 14:32
 **/
public class Solution96 {

    @Test
    public void test96() {
        for (int i = 1; i < 15; i++) {
            System.out.println(numTrees(i));
        }
    }

    public int numTrees(int n){
        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }

    public int numTrees1(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int L = 0; L < i; L++) {
                dp[i] += dp[L] * dp[i - 1 - L];
            }
        }
        return dp[n];
    }
}
