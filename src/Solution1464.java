import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 18:35
 **/
public class Solution1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return (nums[len - 1] - 1) * (nums[len - 2] - 1);
    }
}
