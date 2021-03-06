package top200;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 13:56
 **/
public class Solution7 {

    @Test
    public void test7() {
        int x = 120;
        int result = reverse(x);
        System.out.println(result);
    }

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) {
                return 0;
            } else if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }
}
