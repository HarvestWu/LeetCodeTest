package LCP;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 19:48
 **/
public class SolutionLCP01 {
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
