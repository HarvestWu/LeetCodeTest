package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 17:30
 **/
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int result = nums[0], sum = 0;
        for (int n : nums) {
            if (sum > 0) {
                sum += n;
            } else {
                sum = n;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}
