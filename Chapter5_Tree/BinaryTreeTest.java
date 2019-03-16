class Node {
    int val;
    Node lChild;
    Node rChild;
    Node() {
        this.val = 0;
        this.lChild = null;
        this.rChild = null;
    }
    Node(int value) {
        this.val = value;
        this.lChild = null;
        this.rChild = null;
    }
    Node(int value, Node lChild, Node rChild) {
        this.val = value;
        this.lChild = lChild;
        this.rChild = rChild;
    }
}

public class BinaryTreeTest {
    public static void main(String[] args) {
        Node aTree = new Node(5, new Node(4, new Node(2), null), new Node(3));
        Node bTree = copyTree(aTree);
        System.out.println("Node 數目：" + countNode(aTree));
        System.out.println("Tree 高度：" + height(aTree));
        System.out.println("Leaf 數目：" + countLeaf(aTree));
        System.out.println("Leaf 數目：" + countnLeaf(aTree));
        System.out.println("Non-Leaf 數目：" + countNonLeaf(aTree));
    }

    static Node copyTree(Node original) {
        if (original == null) return null;

        Node result = new Node();
        result.val = original.val;
        result.lChild = copyTree(result.lChild);
        result.rChild = copyTree(result.rChild);
        return result;
    }

    static boolean equalTree(Node s, Node t) {
        boolean flag = false;
        if (s == null && t == null) return true;
        else if (s != null && t != null) {
            if (s.val == t.val) {
                if (equalTree(s.lChild, t.lChild)) {
                    flag = equalTree(s.rChild, t.rChild);
                }
            }
        }
        return flag;
    }

    static int countNode(Node original) {
        if (original == null) return 0;
        else {
            int nLeft = countNode(original.lChild);
            int nRight = countNode(original.rChild);
            return nLeft+nRight+1;
        }
    }

    static int height(Node original) {
        if (original == null) return 0;
        else {
            int hLeft = height(original.lChild);
            int hRight = height(original.rChild);
            return Math.max(hLeft, hRight)+1;
        }
    }

    static int countLeaf(Node original) {
        if (original == null) return 0;
        else {
            if (original.lChild == null && original.lChild == null) return 1;
            else return countnLeaf(original.lChild) + countnLeaf(original.rChild);
        }
    }

    static int countNonLeaf(Node original) {
        if (original == null) return 0;
        else {
            if (original.lChild == null && original.lChild == null) return 0;
            else return 1 + countNonLeaf(original.lChild) + countNonLeaf(original.rChild);
        }
    }

    static void swapTree(Node original) {
        if (original != null) {
            swapTree(original.lChild);
            swapTree(original.rChild);
            Node temp = original.lChild;
            original.lChild = original.rChild;
            original.rChild = temp;
        }
    }
}