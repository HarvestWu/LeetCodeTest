package top401to600;

import construct.Node;
import org.junit.Test;

import java.util.*;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-18 12:12
 **/
public class Solution589 {

    @Test
    public void test589() {
        Node n = new Node(3, Arrays.asList(new Node(5), new Node(6)));
        Node root = new Node(1,Arrays.asList(n,new Node(2),new Node(4)));
        System.out.println(preorder(root));
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root != null){
            stack.push(root);
            while (!stack.isEmpty()){
                Node t = stack.pop();
                list.add(t.val);
                if (t.children!=null){
                    Collections.reverse(t.children);
                    stack.addAll(t.children);
                }
            }

        }
        return list;
    }

    public List<Integer> preorder1(Node root) {
        pre(root);
        return list;
    }

    public void pre(Node root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.children!=null){
            for (Node n : root.children) {
                pre(n);
            }
        }
    }
}
