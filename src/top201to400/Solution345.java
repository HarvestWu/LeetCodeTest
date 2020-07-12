package top201to400;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-12 15:53
 **/
public class Solution345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        String t = null, vowel = "aeiouAEIOU";
        while (left < right) {
            while (left < right && !vowel.contains(String.valueOf(chars[left]))) {
                left++;
            }
            while (left < right && !vowel.contains(String.valueOf(chars[right]))) {
                right--;
            }
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }
}
