package top200;

import construct.TreeNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-06 23:46
 **/
public class Solution108 {

    @Test
    public void test108() {
        int[] nums = {1, 2, 3, 4, 6};
        TreeNode result = sortedArrayToBST(nums);
        TreeNode.printf(result);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return assistFun(nums, 0, nums.length - 1);
    }

    public TreeNode assistFun(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = assistFun(nums, left, mid - 1);
        root.right = assistFun(nums, mid + 1, right);
        return root;
    }
}
