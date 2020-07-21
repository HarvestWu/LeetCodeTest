package top601to800;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 10:22
 **/
public class Solution697 {

    @Test
    public void test697() {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(findShortestSubArray(nums));
    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>(), count = new HashMap<>(), right = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            left.putIfAbsent(t, i);
            right.put(t, i);
            count.put(t, count.getOrDefault(t, 0) + 1);
        }
        int degree = Collections.max(count.values());
        int result = Integer.MAX_VALUE;
        for (int t : count.keySet()) {
            if (count.get(t) == degree) {
                result = Math.min(result, right.get(t) - left.get(t) + 1);
            }
        }
        return result;
    }
}
