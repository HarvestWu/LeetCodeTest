import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-29 19:21
 **/
public class Solution1370 {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder result = new StringBuilder();
        int len = chars.length, flag = 1, i = 0;
        int count = len;
        char tmp = '1';
        while (count > 0) {
            if (i == len - 1) {
                tmp = '1';
                flag = 0;
            } else if (i == 0) {
                tmp = '1';
                flag = 1;
            }
            if (chars[i] != tmp && chars[i] != ' ') {
                count--;
                tmp = chars[i];
                result.append(chars[i]);
                chars[i] = ' ';
            }

            if (flag == 1) {
                i++;
            } else {
                i--;
            }
        }
        return String.valueOf(result);
    }
}
