package top201to400;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-13 19:05
 **/
public class Solution404 {

    @Test
    public void test404() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(6);
        System.out.println(sumOfLeftLeaves(root));
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                if (root.left.left == null && root.left.right == null) {
                    return root.left.val + sumOfLeftLeaves(root.right);
                }
            }
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
        return 0;
    }
}
