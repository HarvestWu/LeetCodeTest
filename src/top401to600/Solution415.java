package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-14 12:29
 **/
public class Solution415 {

    @Test
    public void test415() {
        String num1 = "10000";
        String num2 = "9999";
        System.out.println(addStrings(num1, num2));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int t1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int t2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = t1 + t2 + carry;
            carry = tmp / 10;
            result.append(tmp % 10);
            i--;
            j--;
        }
        if (carry == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}
