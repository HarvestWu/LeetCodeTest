package top200;

import construct.ListNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 17:10
 **/
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = result;
        int flag = 0, sum;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + flag;
            if (sum >= 10) {
                flag = 1;
                sum -= 10;
            } else {
                flag = 0;
            }
            p.next = new ListNode(sum);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = l1.val + flag;
            if (sum >= 10) {
                flag = 1;
                sum -= 10;
            } else {
                flag = 0;
            }
            p.next = new ListNode(sum);
            p = p.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + flag;
            if (sum >= 10) {
                flag = 1;
                sum -= 10;
            } else {
                flag = 0;
            }
            p.next = new ListNode(sum);
            p = p.next;
            l2 = l2.next;
        }
        if (flag == 1) {
            p.next = new ListNode(1);
            p = p.next;
        }
        p.next = null;
        return result.next;
    }
}
