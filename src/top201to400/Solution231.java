package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 22:05
 **/
public class Solution231 {

    @Test
    public void test231() {
        int n = 12;
        boolean result = isPowerOfTwo(n);
        System.out.println(result);
    }

    public boolean isPowerOfTwo3(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public boolean isPowerOfTwo2(int n) {
        if (n == 0) {
            return false;
        }
        long x = (long) n;
        return (x & -x) == x;
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        long x = (long) n;
        return (x & (x - 1)) == 0;
    }
}
