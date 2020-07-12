package top1201to1400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:31
 **/
public class Solution1342 {

    @Test
    public void test1342() {
        int num = 14;
        int result = numberOfSteps(num);
        System.out.println(result);
    }

    public int numberOfSteps(int num) {
        int result = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                num--;
            } else {
                num >>= 1;
            }
            result++;
        }
        return result;
    }
}
