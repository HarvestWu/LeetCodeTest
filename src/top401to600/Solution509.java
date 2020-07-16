package top401to600;

import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 12:41
 **/
public class Solution509 {

    @Test
    public void test509() {
        for (int i = 0; i < 20; i++) {
            System.out.println(fib(i));
        }
    }

    public int fib(int N) {
        double p1 = (1 + Math.sqrt(5)) / 2;
        double p2 = (1 - Math.sqrt(5)) / 2;
        return (int) Math.round((Math.pow(p1, N) - Math.pow(p2, N)) / Math.sqrt(5));
    }

    public int fib2(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int pre2 = 0, pre1 = 1, current = 0;
        for (int i = 2; i <= N; i++) {
            current = pre1 + pre2;
            pre2 = pre1;
            pre1 = current;
        }
        return current;
    }

    public int fib1(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib1(N - 1) + fib1(N - 2);
    }
}
