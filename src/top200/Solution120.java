package top200;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-14 10:43
 **/
public class Solution120 {

    @Test
    public void test120() {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1 = Collections.singletonList(2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(6, 5, 7);
        List<Integer> list4 = Arrays.asList(4, 1, 8, 3);
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);
        System.out.println(minimumTotal(triangle));

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            dp[i] = dp[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; --j) {
                dp[j] = Math.min(dp[j - 1], dp[j]) + triangle.get(i).get(j);
            }
            dp[0] = dp[0] + triangle.get(i).get(0);
        }
        int minSum = dp[0];
        for (int t : dp) {
            minSum = Math.min(minSum, t);
        }
        return minSum;
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[2][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            int curr = i % 2;
            int prev = 1 - curr;
            dp[curr][0] = dp[prev][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; ++j) {
                dp[curr][j] = Math.min(dp[prev][j - 1], dp[prev][j]) + triangle.get(i).get(j);
            }
            dp[curr][i] = dp[prev][i - 1] + triangle.get(i).get(i);
        }
        int minSum = dp[(n - 1) % 2][0];
        for (int t : dp[(n - 1) % 2]) {
            minSum = Math.min(minSum, t);
        }
        return minSum;
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int minSum = dp[n - 1][0];
        for (int t : dp[n - 1]) {
            minSum = Math.min(minSum, t);
        }
        return minSum;
    }
}
