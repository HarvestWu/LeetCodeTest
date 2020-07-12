package LCP;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 17:55
 **/
public class SolutionLCP06 {

    @Test
    public void testLCP06() {
        int[] coins = {2, 3, 10};
        int result = minCount(coins);
        System.out.println(result);
    }


    public int minCount(int[] coins) {
        int result = 0;
        for (int coin : coins) {
            result += coin / 2 + coin % 2;
        }
        return result;
    }
}
