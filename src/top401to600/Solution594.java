package top401to600;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-18 12:52
 **/
public class Solution594 {

    @Test
    public void test594() {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(findLHS(nums));
    }

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.containsKey(num - 1)) {
                result = Math.max(result, map.get(num) + map.get(num - 1));
            }
            if (map.containsKey(num + 1)) {
                result = Math.max(result, map.get(num) + map.get(num + 1));
            }
        }
        return result;
    }
}
