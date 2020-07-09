package top1401to1600;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 16:44
 **/
public class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
