package top601to800;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-22 20:10
 **/
public class Solution788 {

    @Test
    public void test788() {
        assertEquals(247, rotatedDigits(857));
    }

    public int rotatedDigits(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (judge(i)) {
                result++;
            }
        }
        return result;
    }

    public boolean judge(int num) {
        if (num == 0) {
            return false;
        }
        boolean flag = false;
        while (num != 0) {
            int t = num % 10;
            if (t == 3 || t == 4 || t == 7) {
                return false;
            }
            if (t == 2 || t == 5 || t == 6 || t == 9) {
                flag = true;
            }
            num /= 10;
        }
        return flag;
    }
}
