package top401to600;

import construct.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-01-09 16:03
 **/
public class TestMain {

    private static void test461() {
        int x = 1, y = 4;
        int result = new Solution461().hammingDistance(x, y);
        System.out.println(result);
    }

    private static void test535() {
        String str = "https://leetcode.com/problems/design-tinyurl";
        String result = new Solution535().decode(new Solution535().encode(str));
        System.out.println(result);
    }

    private static void test590() {
        Node node5 = new Node(6, new ArrayList<>());
        Node node4 = new Node(5, new ArrayList<>());
        Node node3 = new Node(4, new ArrayList<>());
        Node node2 = new Node(2, new ArrayList<>());
        Node node1 = new Node(3, Arrays.asList(node4, node5));
        Node root = new Node(1, Arrays.asList(node1, node2, node3));
        List<Integer> result = new Solution590().postorder(root);
        System.out.println(result);

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        test461();
//        test535();
//        test590();
        long end = System.currentTimeMillis();
        System.out.println("RunTime: " + (end - start) + "ms");
    }
}
