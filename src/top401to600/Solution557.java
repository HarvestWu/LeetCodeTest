package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-17 8:46
 **/
public class Solution557 {

    @Test
    public void test557(){
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w:words){
            result.append(new StringBuilder(w).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}
