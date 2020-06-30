/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 16:12
 **/
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                result++;
            } else {
                nums[i - result] = nums[i];
            }
        }
        return nums.length - result;
    }
}
