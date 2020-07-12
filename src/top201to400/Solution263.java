package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-10 23:21
 **/
public class Solution263 {

    @Test
    public void test263() {
        int n = 90;
        boolean result = isUgly(n);
        System.out.println(result);
    }

    public boolean isUgly(int num) {
        if (num < 1){
            return false;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        return num == 1;
    }
}
