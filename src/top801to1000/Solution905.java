package top801to1000;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 14:59
 **/
public class Solution905 {

    @Test
    public void test905() {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{1, 2, 3, 4})));
    }

    public int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            if (A[left] % 2 > A[right] % 2) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }
            if (A[left] % 2 == 0) {
                left++;
            }
            if (A[right] % 2 == 1) {
                right--;
            }
        }
        return A;
    }
}
