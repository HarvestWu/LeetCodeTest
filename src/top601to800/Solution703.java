package top601to800;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-21 10:44
 **/
public class Solution703 {

    @Test
    public void test703() {
        int[] nums = {4, 2, 8, 5};
        KthLargest kthLargest = new KthLargest(3, nums);
        assertEquals(4,kthLargest.add(3));
        assertEquals(5,kthLargest.add(5));
        assertEquals(5,kthLargest.add(10));
        assertEquals(8,kthLargest.add(9));
        assertEquals(8,kthLargest.add(4));
    }

    class KthLargest {
        private int k;
        private PriorityQueue<Integer> queue;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            queue = new PriorityQueue<>(k);
            for (int num : nums) {
                add(num);
            }
        }

        public int add(int val) {
            if (queue.size() < k) {
                queue.add(val);
            } else if (val > queue.peek()) {
                queue.poll();
                queue.add(val);
            }
            return queue.peek();
        }
    }
}
