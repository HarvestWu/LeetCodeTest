package top1201to1400;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:02
 **/
public class Solution1281 {
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
