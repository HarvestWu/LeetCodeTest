package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 13:15
 **/
public class Solution374 {

    @Test
    public void Test374() {
        System.out.println(guessNumber(10));
    }

    int pick = 6;

    public int guess(int num) {
        return Integer.compare(pick, num);
    }

    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left <= right) {
            int mid = (int) (((long) left + right) / 2);
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
