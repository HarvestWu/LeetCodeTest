package top401to600;

import construct.Node;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-07-17 21:37
 **/
public class Solution559 {

    @Test
    public void test559() {
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        List<Node> l3 = Arrays.asList(n5, n6);
        Node n2 = new Node(3, l3);
        Node n3 = new Node(2);
        Node n4 = new Node(4);
        List<Node> l2 = Arrays.asList(n2, n3, n4);
        Node root = new Node(1, l2);
        System.out.println(maxDepth(root));

    }

    public int maxDepth(Node root) {
        int max = 0;
        if (root == null) {
            return 0;
        }
        if (root.children != null && root.children.size() > 0) {
            max = maxDepth(root.children.get(0));
            for (int i = 1; i < root.children.size(); i++) {
                {
                    max = Math.max(max, maxDepth(root.children.get(i)));
                }
            }
        }
        return max + 1;
    }
}
