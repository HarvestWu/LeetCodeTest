import construct.ListNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 15:56
 **/
class Solution237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}