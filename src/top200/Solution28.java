package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 16:21
 **/
public class Solution28 {

    @Test
    public void test28() {
        String haystack = "hello", needle = "ll";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }

    public int strStr(String haystack, String needle) {
        int lh = haystack.length(), ln = needle.length();
        for (int i = 0; i < lh - ln + 1; i++) {
            if (haystack.substring(i, i + ln).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public int strStr1(String haystack, String needle) {
        int lh = haystack.length(), ln = needle.length();
        if (ln == 0) {
            return 0;
        }
        int ph = 0;
        while (ph < lh - ln + 1) {
            while (ph < lh - ln + 1 && haystack.charAt(ph) != needle.charAt(0)) {
                ++ph;
            }
            int currLen = 0, pn = 0;
            while (pn < ln && ph < lh && haystack.charAt(ph) == needle.charAt(pn)) {
                ++ph;
                ++pn;
                ++currLen;
            }
            if (currLen == ln) {
                return ph - ln;
            }
            ph = ph - currLen + 1;
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
