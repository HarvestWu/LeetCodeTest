package top201to400;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-11 22:39
 **/
public class Solution326 {
    public boolean isPowerOfThree1(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public boolean isPowerOfThree2(int n) {
        return Integer.toString(n, 3).matches("10*$");
    }

    public boolean isPowerOfThree3(int n) {
        double i = Math.log10(n) / Math.log10(3);
        return i - ((int) i) == 0;
    }

    public boolean isPowerOfThree4(int n) {
        int k = (int) (Math.log10(Integer.MAX_VALUE) / Math.log10(3));
        int MaxPower = (int) Math.pow(3, k);
        return n > 0 && MaxPower % n == 0;
    }

    public boolean isPowerOfThree(int n) {
        int MaxPower = 1162261467;
        return n > 0 && MaxPower % n == 0;
    }
}
