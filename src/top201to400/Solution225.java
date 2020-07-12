package top201to400;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 21:43
 **/
public class Solution225 {

    @Test
    public void test225() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.empty());

    }

    static class MyStack {
        private Queue<Integer> q1, q2;

        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public void push(int x) {
            q1.add(x);
        }

        public int pop() {
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int top = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return top;
        }

        public int top() {
            int top = 0;
            while (q1.size() > 0) {
                top = q1.remove();
                q2.add(top);
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return top;
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }
}
