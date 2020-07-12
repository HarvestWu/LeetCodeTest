package top1401to1600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 18:04
 **/
public class Solution1475 {

    @Test
    public void test1475() {
        int[] prices = new int[]{8, 4, 6, 2, 3};
        int[] result = finalPrices(prices);
        System.out.println(Arrays.toString(result));
    }

    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
