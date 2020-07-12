package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 17:36
 **/
public class Solution461 {

    @Test
    public void test461() {
        int x = 1, y = 4;
        int result = hammingDistance(x, y);
        System.out.println(result);
    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingDistance1(int x, int y) {
        int xor = x ^ y;
        int result = 0;
        while (xor != 0) {
            if (xor % 2 == 1) {
                result++;
            }
            xor >>= 1;
        }
        return result;
    }

    public int hammingDistance2(int x, int y) {
        int xor = x ^ y;
        int result = 0;
        while (xor != 0) {
            result++;
            xor &= (xor - 1);
        }
        return result;
    }
}
