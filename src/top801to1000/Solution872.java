package top801to1000;

import construct.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 14:00
 **/
public class Solution872 {

    @Test
    public void test872() {
        TreeNode root1 = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), null);
        TreeNode root2 = new TreeNode(2, null, new TreeNode(6, new TreeNode(3), new TreeNode(4)));
        assertTrue(leafSimilar(root1, root2));
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                list.add(root.val);
            }
            dfs(root.left, list);
            dfs(root.right, list);
        }
    }
}
