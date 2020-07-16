package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 11:42
 **/
public class Solution504 {

    @Test
    public void test504() {
        System.out.println(convertToBase7(102));
        System.out.println(convertToBase7(-200));
    }

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        int tnum = num < 0 ? -num : num;
        while (tnum != 0) {
            result.append(tnum % 7);
            tnum /= 7;
        }
        if (num < 0) {
            result.append("-");
        }
        return result.reverse().toString();
    }
}
