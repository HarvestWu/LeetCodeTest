package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 13:04
 **/
public class Solution520 {

    @Test
    public void test520() {
        System.out.println(detectCapitalUse("Alibaba"));
        System.out.println(detectCapitalUse("USER"));
        System.out.println(detectCapitalUse("China"));
        System.out.println(detectCapitalUse("HEllo"));
        System.out.println(detectCapitalUse("isA"));
    }

    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len == 1) {
            return true;
        }
        int flag = 'a' <= word.charAt(0) && word.charAt(0) <= 'z' ? 1 : 2;
        for (int i = 1; i < len; i++) {
            if (flag == 1) {
                if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                    return false;
                }
            } else {
                boolean flag1 = 'a' <= word.charAt(i) && word.charAt(i) <= 'z';
                if (i == 1) {
                    if (flag1) {
                        flag = 1;
                    }
                } else if (flag1) {
                    return false;
                }
            }
        }
        return true;
    }
}
