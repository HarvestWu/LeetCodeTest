package top601to800;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 14:12
 **/
public class Solution680 {

    @Test
    public void test680() {
        System.out.println(validPalindrome(
                "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxj" +
                        "jxqncffvmhvgsymdjgpfdhooxfuupuc" + "u" + "lmgmqfvnbgtapekouga"));
    }

    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1, count = 0;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        return judge(s, l + 1, r) || judge(s, l, r - 1);
    }

    public boolean judge(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
