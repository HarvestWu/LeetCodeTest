package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 16:20
 **/
public class Solution389 {

    @Test
    public void test389() {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public char findTheDifference(String s, String t) {
        int sum = 0;
        for (char c : t.toCharArray()) {
            sum += c;
        }
        for (char c : s.toCharArray()) {
            sum -= c;
        }
        return (char) sum;
    }

    public char findTheDifference2(String s, String t) {
        int single = 0;
        for (char c : s.toCharArray()) {
            single ^= c;
        }
        for (char c : t.toCharArray()) {
            single ^= c;
        }
        return (char) single;
    }

    public char findTheDifference3(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return c;
            } else {
                count[c - 'a']--;
            }
        }
        return ' ';
    }
}
