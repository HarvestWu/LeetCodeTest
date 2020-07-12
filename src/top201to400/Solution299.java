package top201to400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-11 20:37
 **/
public class Solution299 {

    @Test
    public void test299() {
        String secret = "1122", guess = "1222";
        String result = getHint(secret, guess);
        System.out.println(result);
    }

    public String getHint(String secret, String guess) {
        int[] count = new int[10];
        int a = 0, b = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
            } else {
                count[secret.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i)) {
                if (count[guess.charAt(i) - '0'] > 0) {
                    b++;
                    count[guess.charAt(i) - '0']--;
                }
            }
        }
        return a + "A" + b + "B";
    }
}
