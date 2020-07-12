package top201to400;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-12 14:52
 **/
public class Solution342 {

    @Test
    public void test342() {
        int n = 2;
        boolean result = isPowerOfFour(n);
        System.out.println(result);
    }

    public boolean isPowerOfFour1(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public boolean isPowerOfFour2(int n) {
        return Integer.toString(n, 4).matches("10*$");
    }

    public boolean isPowerOfFour3(int n) {
        return n > 0 && (Math.log(n) / Math.log(2) % 2 == 0);
    }

    public boolean isPowerOfFour4(int n) {
        int k = (int) (Math.log(Integer.MAX_VALUE) / Math.log(4));
//        int k = 15;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            list.add((int) Math.pow(4, i));
        }
        return n > 0 && list.contains(n);
    }

    public boolean isPowerOfFour(int n) {
//        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) != 0;
    }
}
