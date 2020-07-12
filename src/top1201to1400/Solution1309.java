package top1201to1400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-29 18:46
 **/
public class Solution1309 {

    @Test
    public void test1309() {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        String result = freqAlphabets(s);
        System.out.println(result);
    }

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
