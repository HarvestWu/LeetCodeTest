package top601to800;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:01
 **/
public class Solution709 {

    @Test
    public void test709() {
        String str = "Hello";
        String result = toLowerCase(str);
        System.out.println(result);
    }

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) ('a' + chars[i] - 'A');
            }
        }
        return String.valueOf(chars);
        //return str.toLowerCase();
    }
}
