import construct.ListNode;
import construct.Node;
import construct.TreeNode;

import java.util.ArrayList;
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

    private static void test3() {
        String s = "abcdabcaa";
        int result = new Solution3().lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    private static void test7() {
        int x = 120;
        int result = new Solution7().reverse(x);
        System.out.println(result);
    }

    private static void test9() {
        int x = -121;
        boolean result = new Solution9().isPalindrome(x);
        System.out.println(result);
    }

    private static void test13() {
        String s = "MCMXCIV";
        int result = new Solution13().romanToInt(s);
        System.out.println(result);
    }

    private static void test14() {
        String[] str = {"tom", "to", "t"};
        String result = new Solution14().longestCommonPrefix(str);
        System.out.println(result);
    }

    private static void test20() {
        String s = "{}[]())";
        boolean result = new Solution20().isValid(s);
        System.out.println(result);
    }

    private static void test21() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode result = new Solution21().mergeTwoLists(l1, l2);
        ListNode.printf(result);
    }

    private static void test26() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = new Solution26().removeDuplicates(nums);
        System.out.println(result);
    }

    private static void test27() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int result = new Solution27().removeElement(nums, 2);
        System.out.println(result);

    }

    private static void test28() {
        String haystack = "hello", needle = "ll";
        int result = new Solution28().strStr(haystack, needle);
        System.out.println(result);
    }

    private static void test35() {
        int[] nums = new int[]{1, 3, 5, 6};
        int result = new Solution35().searchInsert(nums, 7);
        System.out.println(result);
    }

    private static void test38() {
        String result = new Solution38().countAndSay(5);
        System.out.println(result);
    }

    private static void test53() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = new Solution53().maxSubArray(nums);
        System.out.println(result);
    }

    private static void test58() {
        String s = "Hello World";
        int result = new Solution58().lengthOfLastWord(s);
        System.out.println(result);
    }

    private static void test66() {
        int[] digits = {9, 9, 9, 9};
        int[] result = new Solution66().plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    private static void test67() {
        String a = "1111", b = "111";
        String result = new Solution67().addBinary(a, b);
        System.out.println(result);
    }

    private static void test226() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode result = new Solution226().invertTree(root);
        TreeNode.printf(result);
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

    private static void test461() {
        int x = 1, y = 4;
        int result = new Solution461().hammingDistance(x, y);
        System.out.println(result);
    }

    private static void test535() {
        String str = "https://leetcode.com/problems/design-tinyurl";
        String result = new Solution535().decode(new Solution535().encode(str));
        System.out.println(result);
    }

    private static void test590() {
        Node node5 = new Node(6, new ArrayList<>());
        Node node4 = new Node(5, new ArrayList<>());
        Node node3 = new Node(4, new ArrayList<>());
        Node node2 = new Node(2, new ArrayList<>());
        Node node1 = new Node(3, Arrays.asList(node4, node5));
        Node root = new Node(1, Arrays.asList(node1, node2, node3));
        List<Integer> result = new Solution590().postorder(root);
        System.out.println(result);

    }

    private static void test617() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        TreeNode result = new Solution617().mergeTrees(t1, t2);
        TreeNode.printf(result);
    }

    private static void test657() {
        String moves = "LLRR";
        boolean result = new Solution657().judgeCircle(moves);
        System.out.println(result);
    }

    private static void test700() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        TreeNode result = new Solution700().searchBST(root, val);
        TreeNode.printf(result);
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

    private static void test1021() {
        String S = "(()())(())";
        String result = new Solution1021().removeOuterParentheses(S);
        System.out.println(result);
    }

    private static void test1108() {
        String address = "1.1.1.1";
        String result = new Solution1108().defangIPaddr(address);
        System.out.println(result);
    }

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
//        test3();
//        test7();
//        test9();
//        test13();
//        test14();
//        test20();
//        test21();
//        test26();
//        test27();
//        test28();
//        test35();
//        test38();
//        test53();
//        test58();
//        test66();
        test67();
//        test226();
//        test237();
//        test461();
//        test535();
//        test590();
//        test617();
//        test657();
//        test700();
//        test771();
//        test709();
//        test804();
//        test807();
//        test832();
//        test938();
//        test977();
//        test1021();
//        test1108();
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
//        test1431();
//        test1436();
//        test1450();
//        test1460();
//        test1464();
//        test1470();
//        test1475();
//        test1480();
//        test1486();
//        testLCP01();
//        testLCP06();
    }
}
