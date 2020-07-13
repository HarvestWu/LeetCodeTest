package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 20:19
 **/
public class Solution409 {

    @Test
    public void test409() {
        System.out.println(longestPalindrome("abbbcddd"));
    }

    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int result = 0;
        for (int n : count) {
            result += n / 2 * 2;
            if (result % 2 == 0 && n % 2 == 1) {
                result++;
            }
        }
        return result;
    }
}
