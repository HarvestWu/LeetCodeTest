package top401to600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-17 22:13
 **/
public class Solution566 {

    @Test
    public void test566() {
        int[][] nums = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(nums, 4, 1)));
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length < r * c) {
            return nums;
        }
        int[][] result = new int[r][c];
        int i = 0, j = 0;
        for (int[] row : nums) {
            for (int n : row) {
                result[i][j++] = n;
                if (j == c) {
                    j = 0;
                    i++;
                }
            }
        }
        return result;
    }
}
