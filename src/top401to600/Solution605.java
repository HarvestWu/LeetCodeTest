package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-19 15:39
 **/
public class Solution605 {

    @Test
    public void test605() {
        int[] flowerbed = {0, 0, 0, 0, 0};
        System.out.println(canPlaceFlowers(flowerbed, 3));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1 || n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    i++;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                    n--;
                    i++;
                }
            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                n--;
                i++;
            }
            if (n == 0){
                return true;
            }
        }
        return false;
    }
}
