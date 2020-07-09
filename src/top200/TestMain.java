package top200;

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

    private static void test69() {
        int x = 2;
        int result = new Solution69().mySqrt(x);
        System.out.println(result);

        result = new Solution69().mySqrt1(x);
        System.out.println(result);

        result = new Solution69().mySqrt2(x);
        System.out.println(result);
    }

    private static void test70() {
        int n = 5;
        int result = new Solution70().climbStairs(n);
        System.out.println(result);
    }

    private static void test83() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode result = new Solution83().deleteDuplicates(head);
        ListNode.printf(result);
    }

    private static void test88() {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;
        new Solution88().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void test100() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        boolean result = new Solution100().isSameTree(p, p);
        System.out.println(result);
    }

    private static void test101() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        boolean result = new Solution101().isSymmetric(root);
        System.out.println(result);
    }

    private static void test104() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        int result = new Solution104().maxDepth(root);
        System.out.println(result);
    }

    private static void test107() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<List<Integer>> result = new Solution107().levelOrderBottom(root);
        System.out.println(result);
    }

    private static void test108() {
        int[] nums = {1, 2, 3, 4, 6};
        TreeNode result = new Solution108().sortedArrayToBST(nums);
        TreeNode.printf(result);
    }

    private static void test110() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        boolean result = new Solution110().isBalanced(root);
        System.out.println(result);
    }

    private static void test111() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        int result = new Solution111().minDepth(root);
        System.out.println(result);
    }

    private static void test112() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        boolean result = new Solution112().hasPathSum(root, 8);
        System.out.println(result);
    }

    private static void test118() {
        int numRows = 3;
        List<List<Integer>> result = new Solution118().generate(numRows);
        System.out.println(result);
    }

    private static void test119() {
        int rowIndex = 3;
        List<Integer> result = new Solution119().getRow(rowIndex);
        System.out.println(result);
    }

    private static void test121() {
        int[] prices = {1, 6, 2, 3, 5};
        int result = new Solution121().maxProfit(prices);
        System.out.println(result);
    }

    private static void test122() {
        int[] prices = {1, 6, 2, 3, 5};
        int result = new Solution122().maxProfit(prices);
        System.out.println(result);
    }

    private static void test125() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = new Solution125().isPalindrome(s);
        System.out.println(result);
    }

    private static void test136() {
        int[] nums = {1, 2, 3, 4, 3, 2, 1};
        int result = new Solution136().singleNumber(nums);
        System.out.println(result);
    }

    private static void test141() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        boolean result = new Solution141().hasCycle(head);
        System.out.println(result);
    }

    private static void test155() {
        Solution155.MinStack minStack = new Solution155.MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(-1);
        minStack.push(3);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }

    private static void test160() {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode headB = new ListNode(3);
        ListNode same = new ListNode(4);
        same.next = new ListNode(5);
        headA.next.next = same;
        headB.next = same;
        ListNode result = new Solution160().getIntersectionNode(headA, headB);
        System.out.println(result.val);
    }

    private static void test167() {
        int[] numbers = {2, 7, 11, 15};
        int[] result = new Solution167().twoSum(numbers, 9);
        System.out.println(Arrays.toString(result));
    }

    private static void test168() {
        int n = 28;
        String result = new Solution168().convertToTitle(n);
        System.out.println(result);
    }

    private static void test169() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = new Solution169().majorityElement(nums);
        System.out.println(result);
    }

    private static void test171() {
        String s = "A";
        int result = new Solution171().titleToNumber(s);
        System.out.println(result);
    }

    private static void test172() {
        int n = 1808548329;
        int result = new Solution172().trailingZeroes(n);
        System.out.println(result);
    }

    private static void test189() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new Solution189().rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    private static void test190() {
        int n = -3;
        int result = new Solution190().reverseBits(n);
        System.out.println(result);
    }

    private static void test191() {
        int n = -3;
        int result = new Solution191().hammingWeight(n);
        System.out.println(result);
    }

    private static void test198() {
        int[] nums = {2, 7, 9, 3, 1};
        int result = new Solution198().rob(nums);
        System.out.println(result);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
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
//        test67();
//        test69();
//        test70();
//        test83();
//        test88();
//        test100();
//        test101();
//        test104();
//        test107();
//        test108();
//        test110();
//        test111();
//        test112();
//        test118();
//        test119();
//        test121();
//        test122();
//        test125();
//        test136();
//        test141();
//        test155();
//        test160();
//        test167();
//        test168();
//        test169();
//        test171();
//        test172();
//        test189();
//        test190();
//        test191();
//        test198();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
