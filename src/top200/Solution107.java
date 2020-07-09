package top200;

import construct.TreeNode;

import java.util.*;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-06 22:55
 **/
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int num = 1, count = 0;
        Queue<TreeNode> tn = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new LinkedList<>();
        if (root != null) {
            tn.offer(root);
        } else {
            return lists;
        }
        while (!tn.isEmpty()) {
            TreeNode t = tn.poll();
            list.add(t.val);
            num--;
            if (t.left != null) {
                tn.offer(t.left);
                count++;
            }
            if (t.right != null) {
                tn.offer(t.right);
                count++;
            }
            if (num == 0) {
                lists.add(0, list);
                list = new ArrayList<>();
                num = count;
                count = 0;
            }
        }
        return lists;
    }
}
