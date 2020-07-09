package top200;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 23:16
 **/
public class Solution169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int n : nums) {
            if (count == 0) {
                candidate = n;
            }
            count += candidate == n ? +1 : -1;
        }
        return candidate;
    }
}
