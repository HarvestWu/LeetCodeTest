package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 19:23
 **/
public class Solution405 {

    @Test
    public void test405() {
        System.out.println(toHex(26));
    }

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] chars = "0123456789abcdef".toCharArray();
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            int tmp = num & 15;
            str.append(chars[tmp]);
            num = num >>> 4;
        }
        return String.valueOf(str.reverse());
    }
}
