package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 20:03
 **/
public class Solution136 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
