package top401to600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 14:02
 **/
public class Solution492 {

    @Test
    public void test492() {
        System.out.println(Arrays.toString(constructRectangle(4)));
    }

    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);
        while (area % W != 0) {
            W--;
        }
        return new int[]{area / W, W};
    }
}
