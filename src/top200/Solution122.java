package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 18:08
 **/
public class Solution122 {

    @Test
    public void test122() {
        int[] prices = {1, 6, 2, 3, 5};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }
}
