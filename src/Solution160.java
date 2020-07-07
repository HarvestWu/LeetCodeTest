import construct.ListNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 22:01
 **/
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while(p != q){
            p = (p == null) ? headB : p.next;
            q = (q == null) ? headA : q.next;
        }
        return p;
    }
}
