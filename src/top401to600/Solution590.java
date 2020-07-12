package top401to600;

import construct.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-29 20:43
 **/
public class Solution590 {

    @Test
    public void test590() {
        Node node5 = new Node(6, new ArrayList<>());
        Node node4 = new Node(5, new ArrayList<>());
        Node node3 = new Node(4, new ArrayList<>());
        Node node2 = new Node(2, new ArrayList<>());
        Node node1 = new Node(3, Arrays.asList(node4, node5));
        Node root = new Node(1, Arrays.asList(node1, node2, node3));
        List<Integer> result = postorder(root);
        System.out.println(result);

    }

    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            result.addFirst(node.val);
            for (Node item : node.children) {
                if (item != null) {
                    stack.add(item);
                }
            }
        }
        return result;
    }
}
