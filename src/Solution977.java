import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 19:22
 **/
public class Solution977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
