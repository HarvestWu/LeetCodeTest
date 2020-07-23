package top801to1000;

import org.junit.Test;

import java.util.*;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 14:35
 **/
public class Solution884 {

    @Test
    public void test884() {
        String A = "this apple is sweet", B = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(A, B)));
    }

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : A.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        for (String word : B.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> result = new LinkedList<>();
        for (String word : count.keySet()) {
            if (count.get(word) == 1) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
