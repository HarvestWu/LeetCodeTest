package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 23:33
 **/
public class Solution171 {
    public int titleToNumber(String s) {
        int base = 1, result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result += (s.charAt(i) + 1 - 'A') * base;
            base *= 26;
        }
        return result;
    }
}
