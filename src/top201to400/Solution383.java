package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 13:37
 **/
public class Solution383 {

    @Test
    public void test383() {
        String ransomNote = "hello";
        String magazine = "helloacbd";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length()<ransomNote.length()){
            return false;
        }
        int[] counts = new int[26];
        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (counts[c - 'a'] > 0) {
                counts[c - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
