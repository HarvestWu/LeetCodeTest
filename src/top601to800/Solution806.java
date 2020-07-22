package top601to800;

import org.junit.Test;

import java.util.Arrays;


/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 20:40
 **/
public class Solution806 {

    @Test
    public void test806() {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths, S)));
    }

    public int[] numberOfLines(int[] widths, String S) {
        int result = 1, count = 0;
        for (char c : S.toCharArray()) {
            int t = widths[c - 'a'];
            if (count + t <= 100) {
                count += t;
            } else {
                result++;
                count = t;
            }
        }
        return new int[]{result, count};
    }
}
