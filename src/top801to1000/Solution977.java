package top801to1000;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 19:22
 **/
public class Solution977 {

    @Test
    public void test977() {
        int[] A = new int[]{-4, -1, 0, 3, 10};
        int[] result = sortedSquares(A);
        System.out.println(Arrays.toString(result));
    }

    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public int[] sortedSquares1(int[] A) {
        int len = A.length, j = 0, p = 0;
        int[] result = new int[len];
        while (j < len && A[j] < 0) {
            j++;
        }
        int i = j - 1;

        while (i >= 0 && j < len) {
            if (A[i] * A[i] < A[j] * A[j]) {
                result[p++] = A[i] * A[i];
                i--;
            } else {
                result[p++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            result[p++] = A[i] * A[i];
            i--;
        }
        while (j < len) {
            result[p++] = A[j] * A[j];
            j++;
        }

        return result;
    }
}
