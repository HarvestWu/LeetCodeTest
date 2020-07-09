package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-08 22:25
 **/
public class Solution189 {
    public void rotate3(int[] nums, int k) {
        int len = nums.length, pre;
        for (int i = 0; i < k; i++) {
            pre = nums[len - 1];
            System.arraycopy(nums, 0, nums, 1, len - 1);
            nums[0] = pre;
        }
    }

    public void rotate2(int[] nums, int k) {
        int len = nums.length;
        int[] t = new int[len];
        for (int i = 0; i < len; i++) {
            t[(i + k) % len] = nums[i];
        }
        System.arraycopy(t, 0, nums, 0, len);
    }

    public void rotate1(int[] nums, int k) {
        int len = nums.length, count = 0;
        k %= len;
        for (int start = 0; count < len; start++) {
            int current = (start + k) % len;
            int pre = nums[start];
            while (start != current) {
                int tmp = nums[current];
                nums[current] = pre;
                pre = tmp;
                current = (current + k) % len;
                count++;
            }
            nums[start] = pre;
            count++;
        }
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
