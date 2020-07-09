package top200;

import construct.ListNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-05 15:16
 **/
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head, p = head.next;
        while (p != null) {
            if (pre.val == p.val) {
                pre.next = p.next;
            }else{
                pre = pre.next;
            }
            p = p.next;

        }
        return head;
    }
}
