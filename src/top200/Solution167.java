package top200;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 22:22
 **/
public class Solution167 {

    @Test
    public void test167() {
        int[] numbers = {2, 7, 11, 15};
        int[] result = twoSum(numbers, 9);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0, j = numbers.length - 1; i <= j; ) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}
