package top201to400;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 21:04
 **/
public class Solution217 {
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            } else {
                set.add(n);
            }
        }
        return false;
    }
}
