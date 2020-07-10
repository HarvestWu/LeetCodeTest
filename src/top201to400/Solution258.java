package top201to400;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-10 22:21
 **/
public class Solution258 {
    public int addDigits1(int num) {
        int tmp;
        while (num > 9) {
            tmp = 0;
            while (num != 0) {
                tmp += num % 10;
                num /= 10;
            }
            num = tmp;
        }
        return num;
    }

    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 9 == 0 ? 9 : num % 9;
//        return (num-1) % 9 + 1;
    }
}
