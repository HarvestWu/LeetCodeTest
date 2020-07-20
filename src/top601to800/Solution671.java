package top601to800;

import construct.TreeNode;
import org.junit.Test;

import java.util.TreeSet;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 12:49
 **/
public class Solution671 {

    @Test
    public void test671() {
        TreeNode root = new TreeNode(2,new TreeNode(2),new TreeNode(2));
        System.out.println(findSecondMinimumValue(root));
    }

    int min,count = 0;
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null){
            return -1;
        }
        min = root.val;
        count++;
        return set.size() == 2?set.last():-1;
    }

    public void getMin(TreeNode root){

    }

    TreeSet<Integer> set = new TreeSet<>();
    public int findSecondMinimumValue1(TreeNode root) {
        preorder(root);
        return set.size() == 2?set.last():-1;
    }

    public void preorder(TreeNode root){
        if (root!=null){
            set.add(root.val);
            if (set.size()>2){
                set.remove(set.last());
            }
            preorder(root.left);
            preorder(root.right);
        }
    }
}
