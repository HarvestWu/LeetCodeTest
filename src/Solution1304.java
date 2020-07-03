/**
 * @Author: HarvestWu
 * @Date: 2020-06-29 19:08
 **/
public class Solution1304 {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int flag = 0;
        if (n % 2 == 1) {
            result[0] = 0;
            flag = 1;
        }
        int count = 1;
        for (int i = flag; i < n; i += 2) {
            result[i] = count;
            result[i + 1] = -count;
            count++;
        }
        return result;
    }

    public int[] sumZero1(int n) {
        int[] result = new int[n];
        int sum = 0;
        for (int i = 1; i < n; i++) {
            result[i] = i;
            sum -= i;
        }
        result[0] = sum;
        return result;
    }
}
