package top1001to1200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 13:30
 **/
public class Solution1009 {

    @Test
    public void test1009() {
        System.out.println(bitwiseComplement(0));
    }

    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int n = (int) (Math.log(N) / Math.log(2));
        n += Math.pow(2, n) > N ? 0 : 1;
        int m = (int) (Math.pow(2, n) - 1);
        return m ^ N;
    }
}
