package top601to800;

import construct.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-19 17:11
 **/
public class Solution637 {

    @Test
    public void test637() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(averageOfLevels(root));
    }

    List<Integer> count = new ArrayList<>();
    List<Double> result = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        dfs(root, 0);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) / count.get(i));
        }
        return result;
    }

    public void dfs(TreeNode root, int h) {
        if (root != null) {
            if (h < result.size()) {
                result.set(h, result.get(h) + root.val);
                count.set(h, count.get(h) + 1);
            } else {
                result.add((double) root.val);
                count.add(1);
            }
            dfs(root.left, h + 1);
            dfs(root.right, h + 1);
        }
    }
}
