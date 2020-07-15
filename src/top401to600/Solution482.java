package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 13:38
 **/
public class Solution482 {

    @Test
    public void test482() {
        String S = "5F3Z-2e-9-w";
        System.out.println(licenseKeyFormatting(S, 4));
    }

    public String licenseKeyFormatting(String S, int K) {
        S = S.replace("-", "").toUpperCase();
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            result.append(S.charAt(i));
            count++;
            if (count == K && i != 0) {
                count = 0;
                result.append("-");
            }
        }
        return result.reverse().toString();
    }
}
