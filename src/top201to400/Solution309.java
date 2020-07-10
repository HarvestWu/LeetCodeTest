package top201to400;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-10 20:05
 **/
public class Solution309 {
    public int maxProfit1(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[1][0] = Math.max(dp[0][0], dp[0][1] + prices[1]);
        dp[1][1] = Math.max(dp[0][1], dp[0][0] - prices[1]);
        for (int i = 2; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        }
        return dp[len - 1][0];
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int len = prices.length;
        int pre_pre_0, pre_pre_1, pre_0, pre_1;
        pre_pre_0 = 0;
        pre_pre_1 = -prices[0];

        pre_0 = Math.max(pre_pre_0, pre_pre_1 + prices[1]);
        pre_1 = Math.max(pre_pre_1, pre_pre_0 - prices[1]);

        for (int i = 2; i < len; i++) {
            int tmp_0 = Math.max(pre_0, pre_1 + prices[i]);
            int tmp_1 = Math.max(pre_1, pre_pre_0 - prices[i]);
            pre_pre_0 = pre_0;
            pre_0 = tmp_0;
            pre_1 = tmp_1;

        }
        return pre_0;
    }
}
