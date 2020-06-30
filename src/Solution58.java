/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 17:38
 **/
public class Solution58 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if (strs.length == 0) {
            return 0;
        } else {
            return strs[strs.length - 1].length();
        }
    }

    public int lengthOfLastWord1(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count != 0) {
                return count;
            } else if (s.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
            }
        }
        return count;
    }
}
