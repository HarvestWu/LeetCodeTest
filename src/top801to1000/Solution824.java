package top801to1000;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 13:12
 **/
public class Solution824 {

    @Test
    public void test824() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", toGoatLatin("I speak Goat Latin"));
    }

    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        int index = 1;
        for (String s : S.split(" ")) {
            char c = s.charAt(0);
            if (judge(c)) {
                sb.append(s);
            } else {
                sb.append(s.substring(1)).append(c);
            }
            sb.append("ma");
            sb.append("a".repeat(index));
            sb.append(" ");
            index++;
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public boolean judge(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
