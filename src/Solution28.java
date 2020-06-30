/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 16:21
 **/
public class Solution28 {
    public int strStr(String haystack, String needle) {
        int lh = haystack.length(), ln = needle.length();
        if (ln == 0) {
            return 0;
        }
        for (int i = 0; i < lh - ln + 1; i++) {
            if (haystack.substring(i, i + ln).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public int strStr1(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        if (L == 0) {
            return 0;
        }
        int pn = 0;
        while (pn < n - L + 1) {
            while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) {
                ++pn;
            }
            int currLen = 0, pL = 0;
            while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)) {
                ++pn;
                ++pL;
                ++currLen;
            }
            if (currLen == L) {
                return pn - L;
            }
            pn = pn - currLen + 1;
        }
        return -1;
    }
}
