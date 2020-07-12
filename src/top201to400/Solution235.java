package top201to400;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 23:19
 **/
public class Solution235 {

    @Test
    public void test235() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(9);
        TreeNode result = lowestCommonAncestor(root, root.left.right, root.right);
        System.out.println(result.val);
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else {
                return root;
            }
        }
        return null;
    }
}
