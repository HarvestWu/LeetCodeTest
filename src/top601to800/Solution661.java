package top601to800;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 11:47
 **/
public class Solution661 {

    @Test
    public void test661() {
        int[][] M = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] M1 = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}, {14, 15, 16}};
        System.out.println(Arrays.deepToString(imageSmoother(M1)));
    }

    public int[][] imageSmoother(int[][] M) {
        int len1 = M.length, len2 = M[0].length;
        int[][] result = new int[len1][len2];
        int sum, count;
        for (int i = 0; i < len1; i++) {

            for (int j = 0; j < len2; j++) {
                sum = M[i][j];
                count = 1;
                if (i > 0) {
                    if (j > 0) {
                        sum += M[i - 1][j - 1];
                        count++;
                    }
                    sum += M[i - 1][j];
                    count++;
                    if (j + 1 < len2) {
                        sum += M[i - 1][j + 1];
                        count++;
                    }
                }
                if (j > 0) {
                    sum += M[i][j - 1];
                    count++;
                }
                if (j + 1 < len2) {
                    sum += M[i][j + 1];
                    count++;
                }

                if (i + 1 < len1) {
                    if (j > 0) {
                        sum += M[i + 1][j - 1];
                        count++;
                    }
                    sum += M[i + 1][j];
                    count++;
                    if (j + 1 < len2) {
                        sum += M[i + 1][j + 1];
                        count++;
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}
