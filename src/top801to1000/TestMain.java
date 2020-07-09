package top801to1000;

import construct.TreeNode;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

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

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        test804();
//        test807();
//        test832();
//        test938();
//        test977();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
