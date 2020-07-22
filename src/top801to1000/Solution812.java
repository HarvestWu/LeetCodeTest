package top801to1000;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 21:23
 **/
public class Solution812 {

    @Test
    public void test812() {
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        System.out.println(largestTriangleArea(points));
    }

    public double largestTriangleArea(int[][] points) {
        int len = points.length;
        double result = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                for (int k = j + 1; k < len; ++k) {
                    result = Math.max(result, area(points[i], points[j], points[k]));
                }
            }
        }
        return result * 0.5;
    }

    public double area(int[] p1, int[] p2, int[] p3) {
        return Math.abs(p1[0] * p2[1] + p2[0] * p3[1] + p3[0] * p1[1]
                - p1[1] * p2[0] - p2[1] * p3[0] - p3[1] * p1[0]);
    }
}
