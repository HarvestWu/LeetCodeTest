package top401to600;

import construct.TreeNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-16 11:21
 **/
public class Solution501 {

    @Test
    public void test501() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(5);
        System.out.println(Arrays.toString(findMode(root)));

    }

    private TreeNode pre = null;
    private int[] result;
    private int resultCount = 0;
    private int maxCount = 0;
    private int currCount = 0;

    public int[] findMode(TreeNode root) {
        inOrder(root);
        pre = null;
        result = new int[resultCount];
        resultCount = 0;
        currCount = 0;
        inOrder(root);
        return result;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        currCount = (pre != null && pre.val == root.val) ? currCount + 1 : 1;
        if (currCount > maxCount) {
            maxCount = currCount;
            resultCount = 1;
        } else if (currCount == maxCount) {
            if (result != null) {
                result[resultCount] = root.val;
            }
            resultCount++;
        }
        pre = root;
        inOrder(root.right);
    }
}
