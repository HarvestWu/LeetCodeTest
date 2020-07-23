package top801to1000;

import construct.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 14:52
 **/
public class Solution897 {

    @Test
    public void test897() {
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(5));
        TreeNode.printf(increasingBST(root));
    }

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root, vals);
        TreeNode result = new TreeNode(0), cur = result;
        for (int v : vals) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return result.right;
    }

    public void inorder(TreeNode node, List<Integer> vals) {
        if (node == null) {
            return;
        }
        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right, vals);
    }
}
