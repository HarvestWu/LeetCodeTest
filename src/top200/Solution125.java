package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 18:18
 **/
public class Solution125 {
    public boolean isPalindrome1(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i <= j; ) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isDigit(s.charAt(j)) && !Character.isLetter(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
