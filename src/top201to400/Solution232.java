package top201to400;

import java.util.Stack;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-09 22:26
 **/
public class Solution232 {
    static class MyQueue {
        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            while (s1.size() > 1) {
                s2.push(s1.pop());
            }
            int t = s1.pop();
            while (s2.size() > 0) {
                s1.push(s2.pop());
            }
            return t;
        }

        public int peek() {
            while (s1.size() > 1) {
                s2.push(s1.pop());
            }
            int t = s1.pop();
            s2.push(t);
            while (s2.size() > 0) {
                s1.push(s2.pop());
            }
            return t;
        }

        public boolean empty() {
            return s1.empty();
        }
    }
}
