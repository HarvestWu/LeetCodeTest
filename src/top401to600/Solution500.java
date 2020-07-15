package top401to600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 22:05
 **/
public class Solution500 {

    @Test
    public void test500() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public String[] findWords(String[] words) {
        String[] result = new String[words.length];
        int p = 0, flag, line;
        for (String w : words) {
            flag = 1;
            line = getLineNumber(String.valueOf(w.charAt(0)));
            for (int i = 1; i < w.length(); i++) {
                if (line != getLineNumber(String.valueOf(w.charAt(i)))) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                result[p++] = w;
            }
        }
        return Arrays.copyOfRange(result, 0, p);
    }

    public int getLineNumber(String s) {
        String[] lines = {
                "asdfghjklASDFGHJKL",
                "zxcvbnmZXCVBNM"
        };
        return lines[0].contains(s) ? 2 : lines[1].contains(s) ? 3 : 1;
    }
}
