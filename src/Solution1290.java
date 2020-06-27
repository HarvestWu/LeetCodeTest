import construct.ListNode;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-27 18:22
 **/
public class Solution1290 {
    private int base = 1;
    private int result = 0;

    private void fun(ListNode head) {
        if (head != null) {
            fun(head.next);
            result += base * head.val;
            base *= 2;
        }
    }

    public int getDecimalValue(ListNode head) {
//        fun(head);
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
