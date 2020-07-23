package top801to1000;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 13:00
 **/
public class Solution860 {

    @Test
    public void test860() {
        assertTrue(lemonadeChange(new int[]{5, 5, 10}));
        assertFalse(lemonadeChange(new int[]{10, 10}));
    }

    public boolean lemonadeChange(int[] bills) {
        int count5 = 0, count10 = 0;
        for (int bill : bills) {
            if (bill == 5) {
                count5++;
            } else if (bill == 10) {
                if (count5 > 0) {
                    count5--;
                    count10++;
                } else {
                    return false;
                }
            } else {
                if (count10 > 0 && count5 > 0) {
                    count5--;
                    count10--;
                } else if (count5 > 2) {
                    count5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
