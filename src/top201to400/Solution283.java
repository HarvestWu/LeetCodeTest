package top201to400;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-11 17:19
 **/
public class Solution283 {
    public void moveZeroes1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else if (count != 0) {
                nums[i - count] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int t = nums[p];
                nums[p] = nums[i];
                nums[i] = t;
                p++;
//                nums[p++] = nums[i];
//                if (i + 1 != p) {
//                    nums[i] = 0;
//                }
            }
        }
    }
}

