package top601to800;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 13:41
 **/
public class Solution748 {

    @Test
    public void test748() {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        assertEquals("steps", shortestCompletingWord(licensePlate, words));
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] license = count(licensePlate);
        String result = "";
        for (String word : words) {
            if (word.length() < result.length() || result.length() == 0) {
                if (judge(count(word.toLowerCase()), license)) {
                    result = word;
                }
            }
        }
        return result;
    }

    public boolean judge(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] < count2[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] count(String word) {
        int[] result = new int[26];
        for (char c : word.toLowerCase().toCharArray()) {
            if ('a' <= c && c <= 'z') {
                result[c - 'a']++;
            }
        }
        return result;
    }
}
