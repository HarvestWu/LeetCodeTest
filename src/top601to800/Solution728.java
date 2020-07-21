package top601to800;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 12:25
 **/
public class Solution728 {

    @Test
    public void test728() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        assertEquals(list,selfDividingNumbers(1,22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int flag = 1, t = i;
            while (t > 0) {
                int g = t % 10;
                if (g == 0 || i % g != 0) {
                    flag = 0;
                    break;
                }
                t /= 10;
            }
            if (flag == 1) {
                result.add(i);
            }
        }
        return result;
    }
}
