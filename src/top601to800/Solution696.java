package top601to800;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 10:05
 **/
public class Solution696 {

    @Test
    public void test696() {
        System.out.println(countBinarySubstrings("00110011"));
    }

    public int countBinarySubstrings(String s) {
        int preCount = 0, currCount = 1, result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                result += Math.min(preCount, currCount);
                preCount = currCount;
                currCount = 1;
            } else {
                currCount++;
            }
        }
        return result + Math.min(preCount, currCount);
    }

    public int countBinarySubstrings1(String s) {
        int[] count = new int[s.length()];
        int p = 0, result = 0;
        count[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                count[++p] = 1;
            } else {
                count[p]++;
            }
        }
        for (int i = 0; i < p; i++) {
            result += Math.min(count[i], count[i + 1]);
        }
        return result;
    }
}
