package top1201to1400;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 21:52
 **/
public class Solution1323 {
    public int maximum69Number(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        num = Integer.parseInt(String.valueOf(chars));
        return num;
    }
}
