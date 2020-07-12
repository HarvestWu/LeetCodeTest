package top200;

import org.junit.Test;

import java.math.BigInteger;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-08 20:33
 **/
public class Solution172 {

    @Test
    public void test172() {
        int n = 1808548329;
        int result = trailingZeroes(n);
        System.out.println(result);
    }


    public int trailingZeroes2(int n) {
        BigInteger tmp = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            tmp = tmp.multiply(BigInteger.valueOf(i));
        }
        int result = 0;
        while (tmp.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            tmp = tmp.divide(BigInteger.TEN);
            result++;
        }
        return result;
    }

    public int trailingZeroes1(int n) {
        int result = 0;
        for (int i = 5; i <= n; i += 5) {
            int t = i;
            while (t % 5 == 0) {
                result++;
                t /= 5;
            }
        }
        return result;
    }

    public int trailingZeroes(int n) {
        int result = 0;
        while (n > 0) {
            n /= 5;
            result += n;
        }
        return result;
    }
}
