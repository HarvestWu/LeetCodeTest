package top1201to1400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 18:01
 **/
public class Solution1266 {

    @Test
    public void test1266() {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        int result = minTimeToVisitAllPoints(points);
        System.out.println(result);
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 1; i < points.length; i++) {
            int absX = Math.abs(points[i][0] - points[i - 1][0]);
            int absY = Math.abs(points[i][1] - points[i - 1][1]);
            result += Math.max(absX, absY);
        }
        return result;
    }
}
