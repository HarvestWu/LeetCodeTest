package top201to400;

import construct.ListNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 11:39
 **/
public class Solution203 {

    @Test
    public void test203() {
        ListNode head = new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(4))));
        ListNode result = removeElements(head, 4);
        ListNode.printf(result);
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }
}
