package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-12 15:41
 **/
public class Solution344 {

    @Test
    public void test344() {
        char[] s = "hello".toCharArray();
        reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
