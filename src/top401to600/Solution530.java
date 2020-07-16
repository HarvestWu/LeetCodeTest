package top401to600;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 20:01
 **/
public class Solution530 {

    @Test
    public void test530() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        System.out.println(getMinimumDifference(root));
    }

    Integer min = Integer.MAX_VALUE, prev = null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            if (prev != null) {
                min = Math.min(min, root.val - prev);
            }
            prev = root.val;
            inorder(root.right);
        }
    }
}
