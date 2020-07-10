package top201to400;

import construct.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-10 22:08
 **/
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        getPaths(root, "", paths);
        return paths;
    }

    public void getPaths(TreeNode root, String tmpPath, LinkedList<String> paths) {
        if (root != null) {
            tmpPath += root.val;
            if (root.left == null && root.right == null) {
                paths.addLast(tmpPath);
            } else {
                tmpPath += "->";
                getPaths(root.left, tmpPath, paths);
                getPaths(root.right, tmpPath, paths);
            }
        }
    }
}
