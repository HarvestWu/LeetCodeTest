package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-18 11:12
 **/
public class Solution581 {

    @Test
    public void test581() {
        int[] nums = {2,1};
        System.out.println(findUnsortedSubarray(nums));
    }

    public int findUnsortedSubarray(int[] nums) {
        int i,j,len = nums.length;
        for (i = 0;i<len-1;i++){
            if (nums[i]>nums[i+1]){
                break;
            }
        }
        if (i == len -1){
            return 0;
        }
        for (j = len-1;j>=0;j--){
            if (nums[j-1]> nums[j]){
                break;
            }
        }
        int min = nums[i],max = nums[j];
        for (int k = i;k<=j;k++){
            max = Math.max(max,nums[k]);
            min = Math.min(min,nums[k]);
        }
        int l,r;
        for (l=i ;l>=0;l--){
            if (nums[l]<=min){
                break;
            }
        }
        for (r = j;r<len;r++){
            if (nums[r]>=max){
                break;
            }
        }
        return r-l-1;
    }
}
