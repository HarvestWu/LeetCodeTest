package top401to600;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-14 14:22
 **/
public class Solution447 {

    @Test
    public void test447() {
        int[][] points = {{0, 0}, {1, 0,}, {2, 0}};
        System.out.println(numberOfBoomerangs(points));
    }


    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        Map<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                double t = Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2);
                map.put(t, map.getOrDefault(t, 0) + 1);
            }
            for (int n : map.values()) {
                result += n * (n - 1);
            }
            map.clear();
        }
        return result;
    }
}
