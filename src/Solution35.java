/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 16:43
 **/
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
