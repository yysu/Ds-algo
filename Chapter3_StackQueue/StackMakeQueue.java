import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class StackMakeQueue {
    public static void main(String[] args) {
        QueueByStack queue = new QueueByStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
    
}

class QueueByStack {
    Stack<Integer> stackS;
    Stack<Integer> stackT;
    public QueueByStack() {
        this.stackS = new Stack<Integer>();
        this.stackT = new Stack<Integer>();
    }

    public void enqueue(int item) {
        this.stackS.push(item);
    }

    public int dequeue() {
        if (stackT.isEmpty()) {
            // 把stackS的東西pop到stackT裡面儲存
            while (!stackS.isEmpty()) {
                stackT.push(stackS.pop());
            }

            if (stackT.isEmpty()) return -1;
            else return stackT.pop(); 
        }
        return stackT.pop();
    }

}