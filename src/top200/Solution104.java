package top200;

import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-06 22:43
 **/
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left_h = maxDepth(root.left);
        int right_h = maxDepth(root.right);
        return Math.max(left_h, right_h) + 1;
    }
}
