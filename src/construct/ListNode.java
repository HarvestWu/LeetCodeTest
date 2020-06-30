package construct;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-26 16:03
 **/
public class ListNode {
    public int val;
    public ListNode next;


    public ListNode() {
    }


    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printf(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
    }
}
