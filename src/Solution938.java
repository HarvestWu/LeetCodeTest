import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:46
 **/
public class Solution938 {

    private int i = 0;
    private int[] inor = new int[40000];

    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            inor[i++] = root.val;
            inorder(root.right);
        }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        inorder(root);
        int result = 0;
        for (int a : inor) {
            if (a >= L && a <= R) {
                result += a;
            }
            if (a == 0 && result > 0) {
                break;
            }
        }
        return result;
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
