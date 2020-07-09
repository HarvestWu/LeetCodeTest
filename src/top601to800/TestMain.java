package top601to800;

import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

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

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        test617();
//        test657();
//        test700();
//        test771();
//        test709();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
