package top801to1000;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:10
 **/
public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] strings = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder str = new StringBuilder();
            char[] chars = word.toCharArray();
            for (char aChar : chars) {
                str.append(strings[aChar - 'a']);
            }
            set.add(String.valueOf(str));
        }
        return set.size();

    }
}
