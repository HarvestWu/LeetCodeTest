package top601to800;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:01
 **/
public class Solution709 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) ('a' + chars[i] - 'A');
            }
        }
        return String.valueOf(chars);
        //return str.toLowerCase();
    }
}
