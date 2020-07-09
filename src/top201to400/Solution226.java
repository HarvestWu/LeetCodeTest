package top201to400;

import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-28 21:37
 **/
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}