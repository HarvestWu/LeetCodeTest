import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 10:05
 **/
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        return sum(root, sum, 0);
    }

    public boolean sum(TreeNode root, int sum, int tmp) {
        if (root == null) {
            return false;
        }
        if (root.left != null || root.right != null) {
            tmp += root.val;
        }
        if (root.left == null && root.right == null) {
            if (tmp + root.val == sum) {
                return true;
            }
        }
        return sum(root.left, sum, tmp) || sum(root.right, sum, tmp);
    }
}
