package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-05 13:25
 **/
public class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int len = Math.max(a.length(), b.length()), tmp = 0;
        for (int i = 0; i < len; i++) {
            tmp += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            tmp += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            result.append(tmp % 2);
            tmp /= 2;
        }
        if (tmp == 1) {
            result.append('1');
        }
        result.reverse();
        return result.toString();
    }
}
