package top201to400;

import construct.ListNode;
import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

    private static void test202() {
        int n = 19;
        boolean result = new Solution202().isHappy(n);
        System.out.println(result);
    }

    private static void test203() {
        ListNode head = new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(4))));
        ListNode result = new Solution203().removeElements(head, 4);
        ListNode.printf(result);
    }

    private static void test204() {
        int n = 10;
        int result = new Solution204().countPrimes(n);
        System.out.println(result);
    }

    private static void test205() {
        String s = "ab", t = "ca";
        boolean result = new Solution205().isIsomorphic(s, t);
        System.out.println(result);
    }

    private static void test206() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = new Solution206().reverseList(head);
        ListNode.printf(result);
    }

    private static void test217() {
        int[] nums = {1, 4, 7, 2, 5, 8, 2};
        boolean result = new Solution217().containsDuplicate(nums);
        System.out.println(result);
    }

    private static void test219() {
        int[] nums = {99, 99};
        boolean result = new Solution219().containsNearbyDuplicate(nums, 2);
        System.out.println(result);
    }

    private static void test225() {
        Solution225.MyStack stack = new Solution225.MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.empty());

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

    private static void test231() {
        int n = 12;
        boolean result = new Solution231().isPowerOfTwo(n);
        System.out.println(result);
    }

    private static void test232() {
        Solution232.MyQueue queue = new Solution232.MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());

        System.out.println(queue.empty());
    }

    private static void test234() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        boolean result = new Solution234().isPalindrome(head);
        System.out.println(result);
    }

    private static void test235() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(9);
        TreeNode result = new Solution235().lowestCommonAncestor(root, root.left.right, root.right);
        System.out.println(result.val);
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

    private static void test242() {
        String s = "hello", t = "ohell";
        boolean result = new Solution242().isAnagram(s, t);
        System.out.println(result);
    }

    private static void test309() {
        int[] prices = {2, 1, 4};
        int result = new Solution309().maxProfit(prices);
        System.out.println(result);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        test202();
//        test203();
//        test204();
//        test205();
//        test206();
//        test217();
//        test219();
//        test225();
//        test226();
//        test231();
//        test232();
//        test234();
//        test235();
//        test237();
        test242();
//        test309();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
