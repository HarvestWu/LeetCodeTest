package top201to400;

import construct.ListNode;
import org.junit.Test;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:56
 **/
public class Solution237 {

    @Test
    public void test237() {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);
        node.next.next.next.next = null;
        deleteNode(node);
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}