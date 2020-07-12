package top200;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-06 22:43
 **/
public class Solution104 {

    @Test
    public void test104() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        int result = maxDepth(root);
        System.out.println(result);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left_h = maxDepth(root.left);
        int right_h = maxDepth(root.right);
        return Math.max(left_h, right_h) + 1;
    }
}
