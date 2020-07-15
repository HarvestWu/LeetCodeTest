package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 10:22
 **/
public class Solution459 {

    @Test
    public void test459() {
        System.out.println(repeatedSubstringPattern("abab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }

    public boolean repeatedSubstringPattern1(String s) {
        int len = s.length(), flag;
        for (int i = 1; i <= len / 2; i++) {
            if (len % i != 0) {
                continue;
            }
            flag = 1;
            for (int j = 0; j < i; j++) {
                char t = s.charAt(j);
                for (int k = j; k < len; k += i) {
                    if (t != s.charAt(k)) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 0) {
                    break;
                }
            }
            if (flag == 1) {
                return true;
            }
        }
        return false;
    }
}
