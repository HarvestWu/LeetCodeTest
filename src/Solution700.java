import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-29 20:25
 **/
public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            if (root.val < val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;
    }
}
