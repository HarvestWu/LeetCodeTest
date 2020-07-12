package top801to1000;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:10
 **/
public class Solution804 {

    @Test
    public void test804() {
        String[] words = {"gin", "zen", "gig", "msg"};
        int result = uniqueMorseRepresentations(words);
        System.out.println(result);
    }

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
