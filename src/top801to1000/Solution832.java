package top801to1000;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:29
 **/
public class Solution832 {

    @Test
    public void test832() {
//        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result = flipAndInvertImage(A);
        System.out.println(Arrays.deepToString(result));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int col = A.length, row = A[0].length;
        int j;
        for (int i = 0; i < col; i++) {
            for (j = 0; j < row / 2; j++) {
                int tmp = A[i][j] == 0 ? 1 : 0;
                A[i][j] = A[i][row - j - 1] == 0 ? 1 : 0;
                A[i][row - j - 1] = tmp;
            }
            if (row % 2 == 1) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
