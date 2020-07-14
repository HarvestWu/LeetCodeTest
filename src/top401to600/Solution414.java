package top401to600;

import org.junit.Test;

import java.util.TreeSet;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-14 11:39
 **/
public class Solution414 {

    @Test
    public void test414() {
        int[] nums = {1, 1, 2};
        System.out.println(thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        long[] t = {nums[0], Long.MIN_VALUE, Long.MIN_VALUE};
        for (int num : nums) {
            if (num == t[0] || num == t[1] || num == t[2]) {
                continue;
            }
            if (num > t[0]) {
                t[2] = t[1];
                t[1] = t[0];
                t[0] = num;
            } else if (num > t[1]) {
                t[2] = t[1];
                t[1] = num;
            } else if (num > t[2]) {
                t[2] = num;
            }
        }
        return (int) (t[2] == Long.MIN_VALUE ? t[0] : t[2]);
    }

    public int thirdMax1(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() == 3 ? set.first() : set.last();
    }
}
