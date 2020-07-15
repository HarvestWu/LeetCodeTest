package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 11:08
 **/
public class Solution463 {

    @Test
    public void test463() {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        System.out.println(islandPerimeter(grid));
    }

    public int islandPerimeter(int[][] grid) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count1 += 1;
                    count2 += i + 1 < grid.length ? grid[i + 1][j] == 1 ? 1 : 0 : 0;
                    count2 += j + 1 < grid[0].length ? grid[i][j + 1] == 1 ? 1 : 0 : 0;
                }

            }
        }
        return 4 * count1 - 2 * count2;
    }
}
