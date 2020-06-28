/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 17:36
 **/
public class Solution461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingDistance1(int x, int y) {
        int xor = x ^ y;
        int result = 0;
        while (xor != 0) {
            if (xor % 2 == 1) {
                result++;
            }
            xor >>= 1;
        }
        return result;
    }

    public int hammingDistance2(int x, int y) {
        int xor = x ^ y;
        int result = 0;
        while (xor != 0) {
            result++;
            xor &= (xor - 1);
        }
        return result;
    }
}
