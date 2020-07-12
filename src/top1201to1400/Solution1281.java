package top1201to1400;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:02
 **/
public class Solution1281 {

    @Test
    public void test1281() {
        int n = 4421;
        int result = subtractProductAndSum(n);
        System.out.println(result);
    }

    public int subtractProductAndSum(int n) {
        int multi = 1;
        int sum = 0;
        while (n != 0) {
            multi *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}
