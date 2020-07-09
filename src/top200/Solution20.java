package top200;

import java.util.LinkedList;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-30 15:34
 **/
public class Solution20 {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.getFirst() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.getFirst() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.getFirst() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}
