package top201to400;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 21:17
 **/
public class Solution219 {

    @Test
    public void test219() {
        int[] nums = {99, 99};
        boolean result = containsNearbyDuplicate(nums, 2);
        System.out.println(result);
    }

    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (i + j < nums.length) {
                    if (nums[i] == nums[i + j]) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
                if (set.size() > k) {
                    set.remove(nums[i - k]);
                }

            }
        }
        return false;
    }
}
