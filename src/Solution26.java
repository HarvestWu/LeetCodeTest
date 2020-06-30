/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 16:03
 **/
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int result = 0, len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[result]) {
                nums[++result] = nums[i];
            }
        }
        return result + 1;
    }
}
