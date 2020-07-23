package top801to1000;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 13:45
 **/
public class Solution868 {

    @Test
    public void test868() {
        assertEquals(2, binaryGap(22));
    }

    public int binaryGap(int N) {
        int index = 0, right = -1, result = -1;
        while (N != 0) {
            int t = N % 2;
            if (t == 1) {
                if (right == -1) {
                    right = index;
                } else {
                    result = Math.max(result, index - right);
                    right = index;
                }
            }
            index++;
            N >>= 1;
        }
        return result == -1 ? 0 : result;
    }
}
