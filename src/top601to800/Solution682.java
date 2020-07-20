package top601to800;

import org.junit.Test;

import java.util.Stack;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-20 14:41
 **/
public class Solution682 {

    @Test
    public void test682() {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(ops));
    }

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if ("+".equals(op)) {
                int top = stack.pop();
                int top1 = top + stack.peek();
                stack.push(top);
                stack.push(top1);
            } else if ("C".equals(op)) {
                stack.pop();
            } else if ("D".equals(op)) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        int sum = 0;
        for (int n : stack) {
            sum += n;
        }
        return sum;
    }

    public int calPoints1(String[] ops) {
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            if ("+".equals(ops[i])) {
                int count = 2, p = i - 1, t = 0;
                while (true) {
                    if (ops[p].matches("[0-9]*") || ops[p].length() > 1) {
                        count--;
                        t += Integer.valueOf(ops[p]);
                    }
                    if (count == 0) {
                        sum += t;
                        ops[i] = String.valueOf(t);
                        break;
                    }
                    p--;
                }
            } else if ("C".equals(ops[i])) {
                int p = i - 1;
                while (true) {
                    if (ops[p].matches("[0-9]*") || ops[p].length() > 1) {
                        sum -= Integer.valueOf(ops[p]);
                        ops[p] = "C";
                        break;
                    }
                    p--;
                }
            } else if ("D".equals(ops[i])) {
                int p = i - 1;
                while (true) {
                    if (ops[p].matches("[0-9]*") || ops[p].length() > 1) {
                        ops[i] = String.valueOf(2 * Integer.valueOf(ops[p]));
                        sum += Integer.valueOf(ops[i]);
                        break;
                    }
                    p--;
                }

            } else {
                sum += Integer.valueOf(ops[i]);
            }
        }
        return sum;
    }
}
