package top801to1000;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 22:00
 **/
public class Solution852 {

    @Test
    public void test852() {
        System.out.println(peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
    }

    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
