package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 23:33
 **/
public class Solution171 {

    @Test
    public void test171() {
        String s = "A";
        int result = titleToNumber(s);
        System.out.println(result);
    }

    public int titleToNumber(String s) {
        int base = 1, result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result += (s.charAt(i) + 1 - 'A') * base;
            base *= 26;
        }
        return result;
    }
}
