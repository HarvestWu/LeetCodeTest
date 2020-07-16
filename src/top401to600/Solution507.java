package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 12:14
 **/
public class Solution507 {

    @Test
    public void test507() {
        System.out.println(checkPerfectNumber(28));
    }

    public boolean checkPerfectNumber(int num) {
        if (num == 1){
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            sum += num % i == 0 ? i + (i * i != num ? num / i : 0) : 0;
        }
        return sum == num;
    }

    public boolean checkPerfectNumber1(int num) {
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }
}
