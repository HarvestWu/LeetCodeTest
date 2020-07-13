package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 16:41
 **/
public class Solution392 {

    @Test
    public void test392() {
        System.out.println(isSubsequence("", ""));
    }

    public boolean isSubsequence(String s, String t){
        t = " "+t;
        int n = t.length();
        int[][] dp = new int[n][26];
        for (char ch = 0; ch < 26; ch++) {
            int p = -1;
            for (int i = n - 1; i >= 0; i--) {
                dp[i][ch] = p;
                if (t.charAt(i) == ch + 'a') {
                    p = i;
                }
            }
        }
        int index = 0;
        for (char ch : s.toCharArray()) {
            index = dp[index][ch - 'a'];
            if (index == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean isSubsequence1(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        if (len1 == 0) {
            return true;
        }
        int p = 0;
        for (int i = 0; i < len2; i++) {
            if (t.charAt(i) == s.charAt(p)) {
                p++;
            }
            if (p == len1) {
                return true;
            }
        }
        return false;
    }
}
