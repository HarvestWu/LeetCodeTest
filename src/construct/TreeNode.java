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