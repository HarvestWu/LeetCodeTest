package top1201to1400;

import construct.ListNode;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

    private static void test1221() {
        String s = "RLLLLRRRLR";
        int result = new Solution1221().balancedStringSplit(s);
        System.out.println(result);
    }

    private static void test1252() {
        int n = 2, m = 3;
        int[][] indices = new int[][]{{0, 1}, {1, 1}};
        int result = new Solution1252().oddCells(n, m, indices);
        System.out.println(result);
    }

    private static void test1266() {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        int result = new Solution1266().minTimeToVisitAllPoints(points);
        System.out.println(result);
    }

    private static void test1281() {
        int n = 4421;
        int result = new Solution1281().subtractProductAndSum(n);
        System.out.println(result);
    }

    private static void test1290() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(0);
        node.next.next = new ListNode(1);
        int result = new Solution1290().getDecimalValue(node);
        System.out.println(result);
    }

    private static void test1295() {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = new Solution1295().findNumbers(nums);
        System.out.println(result);
    }

    private static void test1299() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] result = new Solution1299().replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    private static void test1304() {
        int n = 5;
        int[] result = new Solution1304().sumZero(n);
        for (int a : result) {
            System.out.print(a + " ");
        }
    }

    private static void test1309() {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        String result = new Solution1309().freqAlphabets(s);
        System.out.println(result);
    }

    private static void test1313() {
        int[] nums = {1, 2, 3, 4};
        int[] result = new Solution1313().decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }

    private static void test1323() {
        int num = 9669;
        int result = new Solution1323().maximum69Number(num);
        System.out.println(result);
    }

    private static void test1342() {
        int num = 14;
        int result = new Solution1342().numberOfSteps(num);
        System.out.println(result);
    }

    private static void test1351() {
        int[][] grid = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int result = new Solution1351().countNegatives(grid);
        System.out.println(result);
    }

    private static void test1365() {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] result = new Solution1365().smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    private static void test1370() {
        String s = "aaaabbbbcccc";
        String result = new Solution1370().sortString(s);
        System.out.println(result);
    }

    private static void test1389() {
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        int[] result = new Solution1389().createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        test1221();
//        test1252();
//        test1266();
//        test1281();
//        test1290();
//        test1299();
//        test1295();
//        test1304();
//        test1309();
//        test1313();
//        test1323();
//        test1342();
//        test1351();
//        test1365();
//        test1370();
//        test1389();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
