package top401to600;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-17 22:02
 **/
public class Solution563 {

    @Test
    public void test563() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(findTilt(root));
    }

    int tilt = 0;

    public int findTilt(TreeNode root) {
        traverse(root);
        return tilt;
    }

    public int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = traverse(root.left);
        int rightSum = traverse(root.right);
        tilt += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
}
