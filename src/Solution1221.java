/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 22:06
 **/
public class Solution1221 {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int L = 0, R = 0;
        int result = 0;
        for (char c : chars) {
            if (c == 'L') {
                if (R > 0) {
                    R--;
                } else {
                    L++;
                }
            } else {
                if (L > 0) {
                    L--;
                } else {
                    R++;
                }
            }
            if (L == 0 && R == 0) {
                result++;
            }
        }
        return result;
    }

    public int balancedStringSplit1(String s) {
        char[] chars = s.toCharArray();
        int stack = 0;
        int result = 0;
        for (char c : chars) {
            if (c == 'L') {
                stack++;
            } else {
                stack--;
            }
            if (stack == 0) {
                result++;
            }
        }
        return result;
    }
}
