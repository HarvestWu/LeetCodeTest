package top401to600;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 11:25
 **/
public class Solution475 {

    @Test
    public void test475() {
//        int[] houses = {282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923};
////        int[] heaters = {823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729,
////                823378840, 143542612};
        int[] houses = {1,5};
        int[] heaters = {2};
        System.out.println(findRadius(houses, heaters));
    }

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int len2 = heaters.length, max = Integer.MIN_VALUE,p = 0;
        for (int house : houses) {
            while (p < len2 - 1 && house > heaters[p]) {
                p++;
            }
            if (p == 0 || house > heaters[p]) {
                max = Math.max(max, Math.abs(heaters[p] - house));
            } else {
                max = Math.max(Math.min(house - heaters[p - 1], heaters[p] - house), max);
            }
        }
        return max;
    }
}
