package top200;

import construct.ListNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 17:10
 **/
public class Solution2 {

    @Test
    public void test2() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

//        ListNode l1 = new ListNode(9);
//
//        ListNode l2 = new ListNode(1);
//        ListNode p = l2;
//        for (int i = 0; i < 9; i++) {
//            p.next = new ListNode(9);
//            p = p.next;
//        }
//        p.next = null;

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

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
