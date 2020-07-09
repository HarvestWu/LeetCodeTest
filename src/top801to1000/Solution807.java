package top801to1000;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:14
 **/
public class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int col = grid.length, row = grid[0].length;
        int[] tTb = new int[row], lTr = new int[col];
        for (int i = 0; i < row; i++) {
            int max = 0;
            for (int j = 0; j < col; j++) {
                if (max < grid[j][i]) {
                    max = grid[j][i];
                }
            }
            tTb[i] = max;
        }
        for (int i = 0; i < col; i++) {
            int max = 0;
            for (int j = 0; j < row; j++) {
                if (max < grid[i][j]) {
                    max = grid[i][j];
                }
            }
            lTr[i] = max;
        }
        int result = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                int minmax = Math.min(lTr[i], tTb[j]);
                result += minmax - grid[i][j];
            }
        }
        return result;
    }
}
