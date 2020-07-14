package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-14 13:35
 **/
public class Solution441 {

    @Test
    public void test441(){
        System.out.println(arrangeCoins(1804289383));
    }

    public int arrangeCoins(int n) {
        return (int) ((Math.sqrt(1+(long)n*8)-1)/2);
    }
}
