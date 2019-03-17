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

public class BinarySearchTree {
    public static void main(String[] args) {
        Node aTree = new Node(5, new Node(3, new Node(2), new Node(4)), 
                        new Node(10, new Node(8), null));
        
        System.out.println("Search 7 in BST : " + search(aTree, 7));
        System.out.println("Search 10 in BST : " + search(aTree, 10));
    }

    static boolean search(Node root, int value) {
        if (root != null) {
            if (root.val == value) return true;
            else {
                if (root.val > value) return search(root.lChild, value);
                else return search(root.rChild, value);
            }
        }
        return false;
    }    
}