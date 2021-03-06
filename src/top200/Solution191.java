package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 0:14
 **/
public class Solution191 {

    @Test
    public void test191() {
        int n = -3;
        int result = new Solution191().hammingWeight(n);
        System.out.println(result);
    }

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
//            count += (n >> i) & 1;
//            count += ((n >> i) & 1) == 1 ? 1 : 0;
            count += (n & (1 << i)) != 0 ? 1 : 0;
        }
        return count;
    }

    public int hammingWeight1(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }
}
