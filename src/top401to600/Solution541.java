package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 22:20
 **/
public class Solution541 {

    @Test
    public void test541() {
        String s = "abcdefg";
        System.out.println(reverseStr(s,8));
    }

    public String reverseStr(String s, int k) {
        int len = s.length(), p = 0;
        char[] chars = s.toCharArray();
        while (p < len) {
            int left = p, right = p + k-1;
            right = right < len ? right : len - 1;
            while (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
            p += 2 * k;
        }
        return String.valueOf(chars);
    }
}
