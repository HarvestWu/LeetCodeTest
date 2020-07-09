package LCP;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 17:55
 **/
public class SolutionLCP06 {
    public int minCount(int[] coins) {
        int result = 0;
        for (int coin : coins) {
            result += coin / 2 + coin % 2;
        }
        return result;
    }
}
