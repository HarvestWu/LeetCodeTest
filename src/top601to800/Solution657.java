package top601to800;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 22:09
 **/
public class Solution657 {

    @Test
    public void test657() {
        String moves = "LLRR";
        boolean result = judgeCircle(moves);
        System.out.println(result);
    }

    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int x = 0, y = 0;
        for (char c : chars) {
            if (c == 'U') {
                y++;
            } else if (c == 'D') {
                y--;
            } else if (c == 'R') {
                x++;
            } else {
                x--;
            }
        }
        return x == 0 && y == 0;
    }
}
