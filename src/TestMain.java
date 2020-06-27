import construct.ListNode;
import construct.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

    private static void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new Solution1().twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        int[] result1 = new Solution1().twoSum1(nums, target);
        System.out.println(Arrays.toString(result1));
    }

    private static void test2() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

//        ListNode l1 = new ListNode(9);
//
//        ListNode l2 = new ListNode(1);
//        ListNode p = l2;
//        for (int i = 0; i < 9; i++) {
//            p.next = new ListNode(9);
//            p = p.next;
//        }
//        p.next = null;

        ListNode result = new Solution2().addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

    private static void test237() {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);
        node.next.next.next.next = null;
        new Solution237().deleteNode(node);
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    private static void test535() {
        String str = "https://leetcode.com/problems/design-tinyurl";
        String result = new Solution535().decode(new Solution535().encode(str));
        System.out.println(result);
    }

    private static void test709() {
        String str = "Hello";
        String result = new Solution709().toLowerCase(str);
        System.out.println(result);
    }

    private static void test771() {
        String J = "aA";
        String S = "aAAbbbb";
        int result = new Solution771().numJewelsInStones(J, S);
        System.out.println(result);
    }

    private static void test804() {
        String[] words = {"gin", "zen", "gig", "msg"};
        int result = new Solution804().uniqueMorseRepresentations(words);
        System.out.println(result);
    }

    private static void test807() {
        int[][] grid = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int result = new Solution807().maxIncreaseKeepingSkyline(grid);
        System.out.println(result);
    }

    private static void test832() {
//        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result = new Solution832().flipAndInvertImage(A);
        System.out.println(Arrays.deepToString(result));
    }

    private static void test938() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.left.left.left = new TreeNode(1);
        root.left.right.right = new TreeNode(6);
        int L = 6, R = 10;
        int result = new Solution938().rangeSumBST(root, L, R);
        System.out.println(result);
    }

    private static void test977() {
        int[] A = new int[]{-4, -1, 0, 3, 10};
        int[] result = new Solution977().sortedSquares(A);
        System.out.println(Arrays.toString(result));
    }

    private static void test1108() {
        String address = "1.1.1.1";
        String result = new Solution1108().defangIPaddr(address);
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

    private static void test1290(){
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

    private static void test1313() {
        int[] nums = {1, 2, 3, 4};
        int[] result = new Solution1313().decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }

    private static void test1342() {
        int num = 14;
        int result = new Solution1342().numberOfSteps(num);
        System.out.println(result);
    }

    private static void test1365() {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] result = new Solution1365().smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    private static void test1389() {
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        int[] result = new Solution1389().createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }

    private static void test1431() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = new Solution1431().kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    private static void test1450() {
        int[] startTime = {1, 2, 3}, endTime = {3, 2, 7};
        int queryTime = 4;
        int result = new Solution1450().busyStudent(startTime, endTime, queryTime);
        System.out.println(result);
    }

    private static void test1470() {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = new Solution1470().shuffle(nums, n);
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
//        test1();
//        test2();
//        test237();
//        test535();
//        test771();
//        test709();
//        test804();
//        test807();
//        test832();
//        test938();
//        test977();
//        test1108();
//        test1266();
//        test1281();
        test1290();
//        test1295();
//        test1313();
//        test1342();
//        test1365();
//        test1389();
//        test1431();
//        test1450();
//        test1470();
//        test1480();
//        test1486();
//        testLCP01();
//        testLCP06();
    }
}
