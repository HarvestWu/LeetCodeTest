package top201to400;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-12 16:39
 **/
public class Solution350 {

    @Test
    public void test350() {
        int[] num1 = {1, 2, 3, 4, 4, 5}, num2 = {7, 8, 9, 1, 4, 4, 5};
        int[] result = intersect(num1, num2);
        System.out.println(Arrays.toString(result));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int p = 0;
        for (int n : nums2) {
            int t = map.getOrDefault(n, 0);
            if (t > 0) {
                result[p++] = n;
                map.put(n, --t);
            }
        }
        return Arrays.copyOfRange(result, 0, p);
    }
}
