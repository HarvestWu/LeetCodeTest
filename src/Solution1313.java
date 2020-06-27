import java.util.ArrayList;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 19:58
 **/
public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        int len = 0, p = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int[] result = new int[len];
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result[p++] = nums[i + 1];
            }
        }
        return result;
    }
}
