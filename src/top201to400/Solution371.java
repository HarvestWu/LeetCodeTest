package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 12:23
 **/
public class Solution371 {

    @Test
    public void test371() {
        System.out.println(getSum(10, 20));
    }

    public int getSum(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return a;
    }
}
