package top401to600;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-18 10:51
 **/
public class Solution575 {

    @Test
    public void test575() {
        int[] candies = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(candies));
    }

    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int count = 1;
        for (int i = 1; i < candies.length && count < candies.length / 2; i++) {
            if (candies[i - 1] < candies[i]) {
                count++;
            }
        }
        return count;
    }

    public int distributeCandies1(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(candies.length / 2, set.size());
    }
}
