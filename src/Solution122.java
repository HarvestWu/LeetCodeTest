/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 18:08
 **/
public class Solution122 {
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
