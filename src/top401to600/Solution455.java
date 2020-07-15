package top401to600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 10:10
 **/
public class Solution455 {

    @Test
    public void test455() {
        int[] g = {1, 2, 3}, s = {1, 1};
        System.out.println(findContentChildren(g, s));
    }

    public int findContentChildren(int[] g, int[] s) {
        int len2 = s.length, result = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int value : g) {
            while (j < len2) {
                if (s[j++] >= value) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
