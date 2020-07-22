package top601to800;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 9:22
 **/
public class Solution766 {

    @Test
    public void test766() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        assertTrue(isToeplitzMatrix(matrix));
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isToeplitzMatrix1(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!map.containsKey(i - j)) {
                    map.put(i - j, matrix[i][j]);
                } else if (matrix[i][j] != map.get(i - j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
