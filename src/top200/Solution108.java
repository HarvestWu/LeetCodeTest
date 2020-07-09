package top200;

import construct.TreeNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-06 23:46
 **/
public class Solution108 {
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
