package top201to400;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-12 16:11
 **/
public class Solution349 {

    @Test
    public void test349() {
        int[] num1 = {1, 2, 3, 4, 5}, num2 = {7, 8, 9, 1, 5};
        int[] result = intersection(num1, num2);
        System.out.println(Arrays.toString(result));
    }

    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            if (set1.contains(n)) {
                set.add(n);
            }
        }
        int[] result = new int[set.size()];
        int p = 0;
        for (int n : set) {
            result[p++] = n;
        }
        return result;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int p = 0;
        for (int n : set1) {
            result[p++] = n;
        }
        return result;
    }
}
