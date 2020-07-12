package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-11 20:21
 **/
public class Solution292 {

    @Test
    public void test292() {
        int n = 8;
        boolean result = canWinNim(n);
        System.out.println(result);
    }


    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}