package top201to400;

import construct.ListNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 20:56
 **/
public class Solution206 {
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
