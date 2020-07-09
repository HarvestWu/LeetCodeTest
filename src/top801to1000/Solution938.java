package top801to1000;

import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:46
 **/
public class Solution938 {
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
