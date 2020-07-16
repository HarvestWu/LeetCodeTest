package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 19:54
 **/
public class Solution521 {

    @Test
    public void test521() {
        System.out.println(findLUSlength("abcd", "abc"));
    }

    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
