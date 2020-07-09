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

    private static void test217(){
        int[] nums = {1,4,7,2,5,8,2};
        boolean result = new Solution217().containsDuplicate(nums);
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

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        test202();
//        test203();
//        test204();
//        test205();
//        test206();
        test217();
//        test226();
//        test237();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
