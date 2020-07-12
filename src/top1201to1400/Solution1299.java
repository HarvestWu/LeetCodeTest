package top1201to1400;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 16:54
 **/
public class Solution1299 {

    @Test
    public void test1299() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public int[] replaceElements(int[] arr) {
        int len = arr.length, tmpMax = arr[len - 1];
        int[] result = new int[len];
        result[len - 1] = -1;
        for (int i = len - 2; i >= 0; i--) {
            result[i] = tmpMax;
            if (arr[i] > tmpMax) {
                tmpMax = arr[i];
            }
        }
        return result;
    }
}
