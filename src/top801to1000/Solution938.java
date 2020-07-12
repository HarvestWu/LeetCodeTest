package top801to1000;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:46
 **/
public class Solution938 {

    @Test
    public void test938() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.left.left.left = new TreeNode(1);
        root.left.right.right = new TreeNode(6);
        int L = 6, R = 10;
        int result = rangeSumBST(root, L, R);
        System.out.println(result);
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        int result = 0;
        if (root.val >= L && root.val <= R) {
            result = root.val;
        }
        return result + rangeSumBST(root.left,L,R) +rangeSumBST(root.right,L,R);
    }

    //深度优先搜索
    int ans;

    public int rangeSumBST1(TreeNode root, int L, int R) {
        ans = 0;
        dfs(root, L, R);
        return ans;
    }

    public void dfs(TreeNode node, int L, int R) {
        if (node != null) {
            if (L <= node.val && node.val <= R) {
                ans += node.val;
            }
            if (L < node.val) {
                dfs(node.left, L, R);
            }
            if (node.val < R) {
                dfs(node.right, L, R);
            }
        }
    }
}
