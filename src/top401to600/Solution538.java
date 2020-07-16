package top401to600;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 21:51
 **/
public class Solution538 {

    @Test
    public void test538(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        TreeNode.printf(convertBST(root));
    }

    public TreeNode convertBST(TreeNode root) {
        inorder(root);
        return root;
    }
    private int sum = 0;
    public void inorder(TreeNode root){
        if (root != null){
            inorder(root.right);
            sum += root.val;
            root.val = sum;
            inorder(root.left);
        }
    }
}
