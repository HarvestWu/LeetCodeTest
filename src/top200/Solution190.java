package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-08 23:40
 **/
public class Solution190 {

    @Test
    public void test190() {
        int n = -3;
        int result = reverseBits(n);
        System.out.println(result);
    }

    public int reverseBits1(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + (n & 1);
            n >>= 1;
        }
        return result;
    }

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result ^= (n & (1 << i)) == 0 ? 0 : (1 << (31 - i));
        }
        return result;
    }
}
