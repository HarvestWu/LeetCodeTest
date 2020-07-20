package top601to800;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 15:44
 **/
public class Solution693 {

    @Test
    public void test693() {
        System.out.println(hasAlternatingBits(3));
    }

    public boolean hasAlternatingBits(int n) {
        int bit = n % 2;
        while (n != 0) {
            n = n >> 1;
            if (n % 2 == bit) {
                return false;
            } else {
                bit = n % 2;
            }
        }
        return true;
    }
}
