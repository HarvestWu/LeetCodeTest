/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 20:17
 **/
public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] table = new int[101];
        int[] result = new int[nums.length];
        for (int n : nums) {
            table[n]++;
        }
        for (int i = 1; i < table.length; i++) {
            table[i] += table[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] == 0 ? 0 : table[nums[i] - 1];
        }
        return result;
    }
}
