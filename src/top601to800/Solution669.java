package top601to800;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 12:39
 **/
public class Solution669 {

    @Test
    public void test669() {
        TreeNode l = new TreeNode(2, new TreeNode(2), new TreeNode(4));
        TreeNode r = new TreeNode(6, null, new TreeNode(7));
        TreeNode root = new TreeNode(5, l, r);
        TreeNode.printf(trimBST(root, 5, 7));
    }

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
