package top200;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-06 21:35
 **/
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1, i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            nums1[p--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[p--] = nums2[j--];
        }
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
