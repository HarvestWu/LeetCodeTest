package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-17 8:34
 **/
public class Solution551 {

    @Test
    public void test551() {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }

    public boolean checkRecord(String s) {
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L' && i + 2 < s.length()) {
                if (s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                    return false;
                }
            }
            countA += s.charAt(i) == 'A' ? 1 : 0;
            if (countA > 1) {
                return false;
            }
        }
        return true;
    }
}
