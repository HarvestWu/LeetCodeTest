/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:18
 **/
public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] chars = J.toCharArray();
        for (char c : chars) {
            result += S.length() - S.replace(String.valueOf(c), "").length();
        }
        return result;
    }
}
