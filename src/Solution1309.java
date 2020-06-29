/**
 * @Author: HarvestWu
 * @Date: 2020-06-29 18:46
 **/
public class Solution1309 {
    public String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; ) {
            if (i + 2 < len && chars[i + 2] == '#') {
                result.append((char) ('a' + (chars[i] - '0') * 10 + chars[i + 1] - '0' - 1));
                i += 3;
            } else {
                result.append((char) ('a' + chars[i] - 1 - '0'));
                i++;
            }
        }
        return String.valueOf(result);
    }
}
