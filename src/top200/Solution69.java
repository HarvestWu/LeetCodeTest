package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-05 13:46
 **/

public class Solution69 {

    @Test
    public void test69() {
        int x = 2;
        int result = new Solution69().mySqrt(x);
        System.out.println(result);

        result = new Solution69().mySqrt1(x);
        System.out.println(result);

        result = new Solution69().mySqrt2(x);
        System.out.println(result);
    }

    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public int mySqrt1(int x) {
        if (x == 0) {
            return 0;
        }
        int l = 1, r = x, result = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (mid <= x / mid) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }

    public int mySqrt2(int x) {
        if (x == 0) {
            return 0;
        }
        double k0 = x, C = x;
        while (true) {
            double k_i = 0.5 * (k0 + C / k0);
            if (Math.abs(k_i - k0) < 1e-7) {
                break;
            }
            k0 = k_i;
        }
        return (int) k0;
    }

    public int mySqrt3(int x) {
        if (x == 0) {
            return 0;
        }
        int result = (int) Math.exp(0.5 * Math.log(x));
        return (result + 1) <= x / (result + 1) ? result + 1 : result;
    }
}