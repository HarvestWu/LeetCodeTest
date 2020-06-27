/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 14:37
 **/
class Solution1480 {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        result[0] = nums[0];
        for (int i = 1; i < len; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
