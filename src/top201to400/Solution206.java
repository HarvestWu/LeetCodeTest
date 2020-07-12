package top201to400;

import construct.ListNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 20:56
 **/
public class Solution206 {

    @Test
    public void test206() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = reverseList(head);
        ListNode.printf(result);
    }

    public ListNode reverseList(ListNode head) {
        ListNode p = new ListNode(),q;
        while (head !=null){
            q = head;
            head = head.next;
            q.next = p.next;
            p.next = q;
        }
        return p.next;
    }
}
