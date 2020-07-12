package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 17:42
 **/
public class Solution121 {

    @Test
    public void test121() {
        int[] prices = {1, 6, 2, 3, 5};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    public int maxProfit1(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }
}
