package top401to600;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 20:36
 **/
public class Solution532 {

    @Test
    public void test532() {
        int[] nums = {3, 1, 4, 1, 5};
        System.out.println(findPairs(nums, 2));
    }

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == nums[i] + k) {
                    map.put(nums[i], nums[j]);
                } else if (nums[j] > nums[i] + k) {
                    break;
                }
            }
        }
        return map.size();
    }
}
