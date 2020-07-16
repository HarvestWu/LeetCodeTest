package top1001to1200;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 22:15
 **/
public class Solution1038 {

    @Test
    public void test1038() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        TreeNode.printf(bstToGst(root));
    }

    public TreeNode bstToGst(TreeNode root) {
        inorder(root);
        return root;
    }

    private int sum = 0;

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.right);
            sum += root.val;
            root.val = sum;
            inorder(root.left);
        }
    }
}
