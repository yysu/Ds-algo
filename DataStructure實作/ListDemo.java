class LinkedList {
    public Node head;
    public int count;
    LinkedList(){
        this.head = new Node();
        this.head.Next = new Node();
        this.count = 1;
    }
}
class Node {
    public int data;
    public Node Next;
    public Node() {
        this.data = 0;
        this.Next = null;
    }
    public Node(int data) {
        this.data = data;
        this.Next = null;
    }
}
public class ListDemo {
    public static void main(String[] argv) {
        LinkedList l1 = new LinkedList();
        System.out.println(l1.count);
    }
}
