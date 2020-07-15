package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 9:41
 **/
public class Solution453 {

    @Test
    public void test453() {
        int[] nums = {-100,0,100};
        System.out.println(minMoves(nums));
    }

    public int minMoves(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            moves += num - min;
        }
        return moves;
    }
}
