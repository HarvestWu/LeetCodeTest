package top801to1000;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 14:22
 **/
public class Solution883 {

    @Test
    public void test883() {
        int[][] grid = {{1, 2}, {3, 4}};
        assertEquals(17, projectionArea(grid));
    }

    public int projectionArea(int[][] grid) {
        int len = grid.length, result = 0;
        for (int i = 0; i < len; ++i) {
            int maxRow = 0, maxCol = 0;
            for (int j = 0; j < len; ++j) {
                if (grid[i][j] > 0) {
                    result++;
                }
                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }
            result += maxRow + maxCol;
        }
        return result;
    }
}
