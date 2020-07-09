package top1001to1200;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 17:06
 **/
public class Solution1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();
        int stack = 0, p = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack++;
                p++;
            } else {
                stack--;
            }
            if (stack > 0 && p > 1) {
                result.append(c);
            }
            if (stack == 0) {
                p = 0;
            }
        }
        return String.valueOf(result);
    }
}
