package LCP;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 19:48
 **/
public class SolutionLCP01 {

    @Test
    public void testLCP01() {
        int[] guess = {1, 2, 3}, answer = {1, 2, 3};
        int result = game(guess, answer);
        System.out.println(result);
    }

    public int game(int[] guess, int[] answer) {
        int result = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                result++;
            }
        }
        return result;
    }
}
