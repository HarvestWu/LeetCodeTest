package LCP;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

    private static void testLCP01() {
        int[] guess = {1, 2, 3}, answer = {1, 2, 3};
        int result = new SolutionLCP01().game(guess, answer);
        System.out.println(result);
    }

    private static void testLCP06() {
        int[] coins = {2, 3, 10};
        int result = new SolutionLCP06().minCount(coins);
        System.out.println(result);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        testLCP01();
//        testLCP06();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
