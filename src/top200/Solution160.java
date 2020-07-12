package top200;

import construct.ListNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 22:01
 **/
public class Solution160 {

    @Test
    public void test160() {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode headB = new ListNode(3);
        ListNode same = new ListNode(4);
        same.next = new ListNode(5);
        headA.next.next = same;
        headB.next = same;
        ListNode result = getIntersectionNode(headA, headB);
        System.out.println(result.val);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while(p != q){
            p = (p == null) ? headB : p.next;
            q = (q == null) ? headA : q.next;
        }
        return p;
    }
}
