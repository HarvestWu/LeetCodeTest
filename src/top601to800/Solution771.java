package top601to800;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:18
 **/
public class Solution771 {

    @Test
    public void test771() {
        String J = "aA";
        String S = "aAAbbbb";
        int result = numJewelsInStones(J, S);
        System.out.println(result);
    }

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] chars = J.toCharArray();
        for (char c : chars) {
            result += S.length() - S.replace(String.valueOf(c), "").length();
        }
        return result;
    }
}
