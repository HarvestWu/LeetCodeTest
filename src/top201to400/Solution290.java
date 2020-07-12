package top201to400;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-11 17:54
 **/
public class Solution290 {

    @Test
    public void test290() {
        String pattern = "abba";
        String str = "cat dog dog cat";
        boolean result = wordPattern(pattern, str);
        System.out.println(result);
    }

    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        char[] c1 = pattern.toCharArray();
        String[] c2  =str.split(" ");
        int len1 = c1.length, len2 = c2.length;
        if (len1 !=len2){
            return false;
        }
        for (int i = 0;i<len1;i++){
            if (map.containsKey(c1[i])){
                if (!map.get(c1[i]).equals(c2[i])){
                    return false;
                }
            }else{
                if (map.containsValue(c2[i])){
                    return false;
                }
                map.put(c1[i],c2[i]);
            }
        }
        return true;
    }
}
