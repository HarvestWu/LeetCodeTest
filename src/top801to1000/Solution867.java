package top801to1000;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 13:31
 **/
public class Solution867 {

    @Test
    public void test867() {
        int[][] A = {{1, 2, 3, 4,}, {5, 6, 7, 8}};
        int[][] expected = {{1, 5}, {2, 6}, {3, 7}, {4, 8}};
        assertEquals(expected, transpose(A));
    }

    public int[][] transpose(int[][] A) {
        int m = A.length, n = A[0].length;
        int[][] B = new int[n][m];
        int r, c = 0;
        for (int[] ints : A) {
            r = 0;
            for (int num:ints) {
                B[r++][c] = num;
            }
            c++;
        }
        return B;
    }
}
