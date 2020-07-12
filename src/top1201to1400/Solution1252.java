package top1201to1400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 21:20
 **/
public class Solution1252 {

    @Test
    public void test1252() {
        int n = 2, m = 3;
        int[][] indices = new int[][]{{0, 1}, {1, 1}};
        int result = oddCells(n, m, indices);
        System.out.println(result);
    }

    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];
        int result = 0;
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((row[i] + col[j]) % 2 == 1) {
                    result++;
                }
            }
        }
        return result;
    }
}
