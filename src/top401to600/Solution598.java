package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-19 15:07
 **/
public class Solution598 {

    @Test
    public void test598() {
        int[][] ops = {{2, 2}, {3, 3}};
        System.out.println(maxCount(3, 3, ops));
    }

    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length  == 0){
            return m*n;
        }
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int[] op : ops) {
            min1 = Math.min(min1, op[0]);
            min2 = Math.min(min2, op[1]);
        }
        return min1 * min2;
    }
}
