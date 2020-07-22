package top601to800;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 9:46
 **/
public class Solution784 {

    @Test
    public void test784() {

        List<String> expected = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
        assertEquals(expected, letterCasePermutation("a1b2"));
    }

    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder());
        for (char c : S.toCharArray()) {
            int size = list.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < size; i++) {
                    list.add(new StringBuilder(list.get(i)));
                    list.get(i).append(Character.toLowerCase(c));
                    list.get(size + i).append(Character.toUpperCase(c));
                }
            } else {
                for (StringBuilder stringBuilder : list) {
                    stringBuilder.append(c);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (StringBuilder s : list) {
            result.add(s.toString());
        }
        return result;
    }
}
