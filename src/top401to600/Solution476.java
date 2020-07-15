package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 13:10
 **/
public class Solution476 {

    @Test
    public void test476() {
        System.out.println(findComplement(1));
    }

    public int findComplement(int num) {
        int n = (int) (Math.log(num) / Math.log(2));
        n += Math.pow(2, n) > num ? 0 : 1;
        int m = (int) (Math.pow(2, n) - 1);
        return m ^ num;
    }
}
