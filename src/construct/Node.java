package construct;

import java.util.List;

/**
 * @Author: HarvestWu
 * @Date: 2020-06-29 20:44
 **/
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
