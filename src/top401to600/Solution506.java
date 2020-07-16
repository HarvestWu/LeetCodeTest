package top401to600;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 11:50
 **/
public class Solution506 {

    @Test
    public void test506() {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(nums)));
    }

    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length, p = 0;
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        int[] tmp = Arrays.copyOfRange(nums, 0, len);
        Arrays.sort(tmp);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = len - 1; i >= 0; i--) {
            map.put(tmp[i], len - i);
        }
        String[] result = new String[len];
        for (int num : nums) {
            int rank = map.get(num);
            result[p++] = rank < 4 ? medals[rank-1] : String.valueOf(rank);
        }
        return result;
    }
}
