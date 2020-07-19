package top601to800;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-19 16:01
 **/
public class Solution606 {

    @Test
    public void test606() {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        System.out.println(tree2str(t));
    }

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return String.valueOf(t.val);
        }
        if (t.right == null) {
            return t.val + "(" + tree2str(t.left) + ")";
        }
        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }
}

