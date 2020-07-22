package top601to800;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 8:59
 **/
public class Solution762 {

    @Test
    public void test762() {
        assertEquals(4, countPrimeSetBits(6, 10));
    }

    public int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i++) {
            result += 665772 >> Integer.bitCount(i) & 1;
        }
        return result;
    }

    public int countPrimeSetBits2(int L, int R) {
        List<Integer> prime = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        int result = 0;
        for (int i = L; i <= R; i++) {
            if (prime.contains(Integer.bitCount(i))) {
                result++;
            }
        }
        return result;
    }

    public int countPrimeSetBits1(int L, int R) {
        List<Integer> prime = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        int result = 0, count, t;
        for (int i = L; i <= R; i++) {
            count = 0;
            t = i;
            while (t != 0) {
                if ((t & 1) == 1) {
                    count++;
                }
                t = t >> 1;
            }
            if (prime.contains(count)) {
                result++;
            }
        }
        return result;
    }
}
