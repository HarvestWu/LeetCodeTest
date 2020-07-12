package top201to400;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-12 16:56
 **/
public class Solution367 {
    public boolean isPerfectSquare1(int num) {
        if (num < 2) {
            return true;
        }
        long left = 2, right = num / 2, mid;
        while (left <= right) {
            mid = (right + left) / 2;
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long x = num / 2;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }
}
