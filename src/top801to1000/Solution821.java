package top801to1000;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 21:46
 **/
public class Solution821 {

    @Test
    public void test821() {
        String S = "loveleetcode";
        char C = 'e';
        System.out.println(Arrays.toString(shortestToChar(S, C)));
    }

    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] result = new int[len];
        int prev = -len;
        for (int i = 0; i < len; ++i) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            result[i] = i - prev;
        }
        prev = 2 * len;
        for (int i = len - 1; i >= 0; --i) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }
        return result;
    }
}
