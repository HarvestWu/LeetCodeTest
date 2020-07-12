package top200;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 0:05
 **/
public class Solution110 {

    @Test
    public void test110() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        boolean result = isBalanced(root);
        System.out.println(result);
    }


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left_h = maxDepth(root.left);
        int right_h = maxDepth(root.right);
        return Math.max(left_h, right_h) + 1;
    }
}
