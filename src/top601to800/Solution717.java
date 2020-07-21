package top601to800;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 12:08
 **/
public class Solution717 {

    @Test
    public void test717() {
        assertTrue(isOneBitCharacter(new int[]{1, 0, 0}));
        assertFalse(isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}
