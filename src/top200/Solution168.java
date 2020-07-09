package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 22:36
 **/
public class Solution168 {

    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.insert(0, (char) (n % 26 + 'A'));
            n /= 26;
        }
        return result.toString();
    }
}
