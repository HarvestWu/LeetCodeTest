package top801to1000;

import construct.ListNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-23 14:09
 **/
public class Solution876 {

    @Test
    public void test876() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode.printf(middleNode(listNode));
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode1(ListNode head) {
        int n = 0, k = 0;
        ListNode cur = head;
        while (cur != null) {
            ++n;
            cur = cur.next;
        }
        cur = head;
        while (k < n / 2) {
            ++k;
            cur = cur.next;
        }
        return cur;
    }
}
