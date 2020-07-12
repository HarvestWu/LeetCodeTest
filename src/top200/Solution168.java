package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 22:36
 **/
public class Solution168 {

    @Test
    public void test168() {
        int n = 28;
        String result = convertToTitle(n);
        System.out.println(result);
    }

    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.insert(0, (char) (n % 26 + 'A'));
            n /= 26;
        }
        return result.toString();
    }
}
