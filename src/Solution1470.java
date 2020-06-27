/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:09
 **/
public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            result[p++] = nums[i];
            result[p++] = nums[n + i];
        }
        return result;
    }
}
