package top401to600;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-15 21:23
 **/
public class Solution496 {

    @Test
    public void test496() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num2 : nums2) {
            while (!stack.empty() && stack.peek() < num2) {
                map.put(stack.pop(), num2);
            }
            stack.push(num2);
        }
        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }
        int p = 0;
        for (int num1 : nums1) {
            result[p++] = map.get(num1);
        }
        return result;
    }

    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int flag, p = 0;
        for (int num1 : nums1) {
            flag = 0;
            for (int num2 : nums2) {
                if (num1 == num2) {
                    flag = 1;
                }
                if (flag == 1 && num1 < num2) {
                    result[p++] = num2;
                    flag = 2;
                    break;
                }
            }
            if (flag != 2) {
                result[p++] = -1;
            }
        }
        return result;
    }
}
