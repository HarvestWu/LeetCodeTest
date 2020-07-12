package top1201to1400;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 20:35
 **/
public class Solution1389 {

    @Test
    public void test1389() {
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        int[] result = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int len = list.size();
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
