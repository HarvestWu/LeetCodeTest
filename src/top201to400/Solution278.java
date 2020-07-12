package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-11 16:59
 **/
public class Solution278 {

    @Test
    public void test278() {
        int n = 5;
        int result = firstBadVersion(n);
        System.out.println(result);
    }

    public int firstBadVersion1(int n) {
        for (int i = 1; i <= n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return n;
    }

    public int firstBadVersion(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = (int) (((long) left + right) / 2);
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int i) {
        boolean[] tmp = {false, false, false, false, true, true};
        return tmp[i];
    }
}
