package top1401to1600;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 14:48
 **/
public class Solution1486 {
    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result = result ^ (start + 2 * i);
        }
        return result;
    }
}
