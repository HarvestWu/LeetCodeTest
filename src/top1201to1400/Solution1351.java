package top1201to1400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 17:21
 **/
public class Solution1351 {

    @Test
    public void test1351() {
        int[][] grid = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int result = countNegatives(grid);
        System.out.println(result);
    }

    public int countNegatives(int[][] grid) {
        int len = grid[0].length;
        int result = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < len; j++) {
                if (ints[j] < 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public int countNegatives1(int[][] grid) {
        int result = 0, m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            int[] row = grid[i];
            if (row[n - 1] >= 0) {
                continue;
            }
            if (row[0] < 0) {
                result += (m - i) * n;
                break;
            }
            int first = binarySearch(row);
            result += n - first;
        }
        return result;
    }

    private int binarySearch(int[] arr) {
        int begin = 0, end = arr.length;
        while (begin < end) {
            int mid = begin + ((end - begin) >> 1);
            if (arr[mid] >= 0) {
                begin = mid + 1;
            } else {
                if (arr[mid - 1] >= 0) {
                    return mid;
                }
                end = mid;
            }
        }
        return begin;
    }
}
