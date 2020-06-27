/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:29
 **/
public class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int col = A.length, row = A[0].length;
        int j;
        for (int i = 0; i < col; i++) {
            for (j = 0; j < row / 2; j++) {
                int tmp = A[i][j] == 0 ? 1 : 0;
                A[i][j] = A[i][row - j - 1] == 0 ? 1 : 0;
                A[i][row - j - 1] = tmp;
            }
            if (row % 2 == 1) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
