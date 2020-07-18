package construct;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 18:46
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void printf(TreeNode root) {
        if (root.left != null) {
            printf(root.left);
        }
        System.out.print(root.val + " ");
        if (root.right != null) {
            printf(root.right);
        }
    }
}