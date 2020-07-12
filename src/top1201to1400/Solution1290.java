package top1201to1400;

import construct.ListNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 18:22
 **/
public class Solution1290 {

    @Test
    public void test1290() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(0);
        node.next.next = new ListNode(1);
        int result = getDecimalValue(node);
        System.out.println(result);
    }

    private int base = 1;
    private int result = 0;

    private void fun(ListNode head) {
        if (head != null) {
            fun(head.next);
            result += base * head.val;
            base *= 2;
        }
    }

    public int getDecimalValue(ListNode head) {
//        fun(head);
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
