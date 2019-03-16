import java.util.List;
import java.util.LinkedList;

class Node {
    public int val;
    List<Node> child;
    public Node() {
        this.val = 0;
        this.children = null;
    }

    public Node(int value) {
        this.val = value;
        this.children = null;
    }

    public Node(int value, List<Node> node) {
        this.val = value;
        this.children = node;
    }
}

public class TreeTest {
    public static void main() {
        List<Node> level2 = new LinkedList<>();
        List<Node> level3 = new LinkedList<>();
        level3.add(new Node(7));
        level3.add(new Node(4));

        level2.add(new Node(3));
        level2.add(new Node(2));
        level2.add(new Node(6, level3));
        level2.add(new Node(8));

        Node tree = new Node(1, level2);

    }
}
/**                 1
 *                / |\ \
 *               3  2 6 8
 *                    /\
 *                   7  4
 */ 