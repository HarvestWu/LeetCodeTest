import java.util.Stack;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-07 21:43
 **/
public class Solution155 {
    static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> min_stack;
        public MinStack() {
            stack = new Stack<>();
            min_stack = new Stack<>();
        }
        public void push(int x) {
            stack.push(x);
            if(min_stack.isEmpty() || x <= min_stack.peek()) {
                min_stack.push(x);
            }
        }
        public void pop() {
            if(stack.pop().equals(min_stack.peek())) {
                min_stack.pop();
            }
        }
        public int top() {
            return stack.peek();
        }
        public int getMin() {
            return min_stack.peek();
        }
    }
}
