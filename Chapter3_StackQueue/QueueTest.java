import java.util.Queue;
import java.util.LinkedList;

public class QueueTest {
    public static void main(String[] args) {
        //testQueue();
        // 運用 array 製作 stack
        QueueLinkedListDemo queueArray = new QueueLinkedListDemo();
        queueArray.enqueue(5);
        queueArray.enqueue(6);
        queueArray.enqueue(7);
        System.out.println("Queue : " + queueArray);
        if (queueArray.isEmpty()) {
            System.out.println("Is Empty");
        } else {
            System.out.println("Is Not Empty");
        }
        System.out.println(queueArray.peek());
        queueArray.dequeue();
        queueArray.dequeue();
        System.out.println("Queue : " + queueArray);
        queueArray.dequeue();
        System.out.println("Queue : " + queueArray);
        if (queueArray.isEmpty()) {
            System.out.println("Is Empty");
        } else {
            System.out.println("Is Not Empty");
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void testQueue() {
        Queue<String> queue = new LinkedList<>();
        System.out.println("enqueue a");
        queue.offer("a");
        System.out.println("enqueue b");
        queue.offer("b");
        System.out.println("enqueue c");
        queue.offer("c");
        System.out.println("enqueue d");
        queue.offer("d");
        System.out.println("enqueue e");
        queue.offer("e");
        System.out.println("search b : " + queue.contains("b"));
        System.out.print("search q : " + queue.contains("q"));
        System.out.println(" , false means this element doesn't exist");
        System.out.println("Dequeue : " + queue);
        queue.poll();
        System.out.println("Dequeue: " + queue);
        queue.poll();
        System.out.println("Dequeue : " + queue);
        queue.poll();
        System.out.println("Queue isEmpty : " + queue.isEmpty());
        System.out.println("Dequeue : " + queue);
        queue.poll();
        System.out.println("Dequeue : " + queue);
        queue.poll();
        System.out.println("Queue isEmpty : " + queue.isEmpty());
        System.out.println("enqueue e");
        queue.offer("e");
        System.out.println("Queue peek : " + queue.peek());
    }
}

class QueueArrayDemo {
    int rear, front;
    int[] array = new int[10];
    public QueueArrayDemo() {
        this.rear = 0;
        this.front = 0;
    }

    public boolean isEmpty() {
        if (rear == front) return true;
        else return false;
    }

    public boolean isFull() {
        if (rear == this.array.length-1) return true;
        else return false;
    }

    public void enqueue(int item) {
        if (!this.isFull()) {
            this.rear++;
            this.array[rear] = item;
        }
    }

    public int dequeue() {
        if(!this.isEmpty()) {
            this.front++;
            int temp = this.array[this.front];
            return temp;
        }
        return -1;
    }

    public int peek() {
        if(!this.isEmpty()) {
            return this.array[this.front+1];
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = this.front; i <= this.rear; i++) {
            result += this.array[i] + " ";
        }
        return result; 
    } 
}

class QueueCirCularArrayDemo {
    int rear, front;
    int[] array = new int[10];
    int n = this.array.length;
    public QueueCirCularArrayDemo() {
        this.rear = 0;
        this.front = 0;
    }

    public boolean isEmpty() {
        if (rear == front) return true;
        else return false;
    }

    public boolean isFull() {
        if (rear == this.array.length-1) return true;
        else return false;
    }

    public void enqueue(int item) {
        if (!this.isFull()) {
            this.rear = (this.rear+1)%this.n;
            this.array[rear] = item;
        }
    }

    public int dequeue() {
        if(!this.isEmpty()) {
            this.front = (this.front+1)%this.n;
            int temp = this.array[this.front];
            return temp;
        }
        return -1;
    }

    public int peek() {
        if(!this.isEmpty()) {
            return this.array[this.front+1];
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = this.front; i <= this.rear; i++) {
            result += this.array[i] + " ";
        }
        return result; 
    } 
}

class Node {
    int val;
    Node next;
    public Node() {
        this.val = 0;
        this.next = null;
    }
    public Node(int value) {
        this.val = value;
        this.next = null;
    }
} 

class QueueLinkedListDemo {
    Node rear, front;
    
    public QueueLinkedListDemo() {
        this.rear = null;
        this.front = null;
    }

    public boolean isEmpty() {
        if (rear == null) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public void enqueue(int item) {
        if (!isFull()) {
            Node temp = new Node(item);
            // Queue為空
            if (this.front == null) {
                this.front = temp;
                this.rear = temp;
            }
            // Queue不為空
            else {
                this.rear.next = temp; 
                this.rear = temp;
            }
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int temp = this.front.val;
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }
            return temp;
        }
        return -1;
    }

    public int peek() {
        if (!isEmpty()) {
            return this.front.val;
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "";
        Node temp = this.front;
        while(temp != null) {
            result += temp.val + " ";
            temp = temp.next;
        }
        return result;
    } 
}