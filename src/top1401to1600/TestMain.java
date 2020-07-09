package top1401to1600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

    private static void test1431() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = new Solution1431().kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    private static void test1436() {
        List<List<String>> paths = new ArrayList<>();
        List<String> list1 = Arrays.asList("London", "New York");
        List<String> list2 = Arrays.asList("New York", "Lima");
        List<String> list3 = Arrays.asList("Lima", "Sao Paulo");
        paths.add(list1);
        paths.add(list2);
        paths.add(list3);
        String result = new Solution1436().destCity(paths);
        System.out.println(result);
    }

    private static void test1450() {
        int[] startTime = {1, 2, 3}, endTime = {3, 2, 7};
        int queryTime = 4;
        int result = new Solution1450().busyStudent(startTime, endTime, queryTime);
        System.out.println(result);
    }

    private static void test1460() {
        int[] target = new int[]{1, 2, 3, 4};
        int[] arr = new int[]{2, 4, 1, 3};
        boolean result = new Solution1460().canBeEqual(target, arr);
        System.out.println(result);
    }

    private static void test1464() {
        int[] nums = {3, 4, 5, 2};
        int result = new Solution1464().maxProduct(nums);
        System.out.println(result);
    }

    private static void test1470() {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = new Solution1470().shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }

    private static void test1475() {
        int[] prices = new int[]{8, 4, 6, 2, 3};
        int[] result = new Solution1475().finalPrices(prices);
        System.out.println(Arrays.toString(result));
    }

    private static void test1480() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] result = new Solution1480().runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    private static void test1486() {
        int result = new Solution1486().xorOperation(5, 0);
        System.out.println(result);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        test1431();
//        test1436();
//        test1450();
//        test1460();
//        test1464();
//        test1470();
//        test1475();
//        test1480();
//        test1486();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
