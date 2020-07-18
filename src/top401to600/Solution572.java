package top401to600;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-17 22:24
 **/
public class Solution572 {

    @Test
    public void test572() {
        TreeNode l3 = new TreeNode(1,new TreeNode(0),null);
        TreeNode l2 = new TreeNode(4, l3, new TreeNode(2));
        TreeNode s = new TreeNode(3, l2, new TreeNode(5));
        TreeNode t = new TreeNode(4,new TreeNode(1),new TreeNode(2));
        System.out.println(isSubtree(s, t));
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }
        if (judge(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean judge(TreeNode s, TreeNode t) {
        if (t == null && s == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        boolean flag = judge(s.left, t.left) && judge(s.right, t.right);
        return flag && (s.val == t.val);
    }
}
