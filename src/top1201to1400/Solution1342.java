package top1201to1400;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:31
 **/
public class Solution1342 {
    public int numberOfSteps(int num) {
        int result = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                num--;
            } else {
                num >>= 1;
            }
            result++;
        }
        return result;
    }
}
