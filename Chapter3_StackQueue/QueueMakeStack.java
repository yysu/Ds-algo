import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class QueueMakeStack {
    public static void main(String[] args) {
        StackByQueue stack = new StackByQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class StackByQueue {
    Queue<Integer> queue;
    public StackByQueue() {
        this.queue = new LinkedList<>();
    }

    public void push(int item) {
        this.queue.offer(item);
    }

    public int pop() {
        for (int i = 0; i < this.queue.size()-1; i++) {
            this.queue.offer(this.queue.poll());
        }
        if (this.queue.isEmpty()) return -1;
        return this.queue.poll();
    }
}