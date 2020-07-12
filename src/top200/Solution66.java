package top200;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-04 22:50
 **/
public class Solution66 {

    @Test
    public void test66() {
        int[] digits = {9, 9, 9, 9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = (++digits[i]) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
