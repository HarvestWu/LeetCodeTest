package top201to400;

import construct.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 22:43
 **/
public class Solution234 {
    public boolean isPalindrome1(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int front = 0, back = list.size() - 1;
        while (front < back) {
            if (!list.get(front).equals(list.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode p = head, q, r = null;
        int count = 0, flag = 1;
        while (p != null) {
            count++;
            p = p.next;
        }
        if (count == 1){
            return true;
        }
        count = count % 2 == 0 ? count / 2 : count / 2 + 1;
        p = head;
        while (count != 0) {
            if (count == 1) {
                r = p;
            }
            p = p.next;
            count--;
        }
        q = reverse(p);
        p = head;
        while (q != null) {
            if (q.val != p.val) {
                flag = 0;
                break;
            }
            q = q.next;
            p = p.next;
        }
        r.next = reverse(p);
        return flag == 1;
    }

    public ListNode reverse(ListNode head) {
        ListNode p = null, tmp;
        while (head != null) {
            tmp = head.next;
            head.next = p;
            p = head;
            head = tmp;
        }
        return p;
    }

}
