import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        // 運用 array 製作 stack
        StackArrayDemo stackArray = new StackArrayDemo();
        stackArray.push(5);
        stackArray.push(6);
        stackArray.push(7);
        System.out.println("Stack : " + stackArray);
        if (stackArray.isEmpty()) {
            System.out.println("Is Empty");
        } else {
            System.out.println("Is Not Empty");
        }
        System.out.println(stackArray.peek());
        stackArray.pop();
        stackArray.pop();
        System.out.println("Stack : " + stackArray);
        stackArray.pop();
        if (stackArray.isEmpty()) {
            System.out.println("Is Empty");
        } else {
            System.out.println("Is Not Empty");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // 運用 linkedlist 製作 stack
        StackLinkedListDemo stackList = new StackLinkedListDemo();
        stackList.push(5);
        stackList.push(6);
        stackList.push(7);
        System.out.println("Stack : " + stackList);
        if (stackList.isEmpty()) {
            System.out.println("Is Empty");
        } else {
            System.out.println("Is Not Empty");
        }
        System.out.println(stackList.peek());
        stackList.pop();
        stackList.pop();
        System.out.println("Stack : " + stackList);
        stackList.pop();
        if (stackList.isEmpty()) {
            System.out.println("Is Empty");
        } else {
            System.out.println("Is Not Empty");
        }
    }

    public static void testStack() {
        Stack<String> stack = new Stack<>();
        System.out.println("push a");
        stack.push("a");
        System.out.println("push b");
        stack.push("b");
        System.out.println("push c");
        stack.push("c");
        System.out.println("push d");
        stack.push("d");
        System.out.println("push e");
        stack.push("e");
        System.out.println("search b : " + stack.search("b"));
        System.out.print("search q : " + stack.search("q"));
        System.out.println(" , -1 means this element doesn't exist");
        System.out.println("Stack pop : " + stack);
        stack.pop();
        System.out.println("Stack pop : " + stack);
        stack.pop();
        System.out.println("Stack pop : " + stack);
        stack.pop();
        System.out.println("Stack isEmpty : " + stack.isEmpty());
        System.out.println("Stack pop : " + stack);
        stack.pop();
        System.out.println("Stack pop : " + stack);
        stack.pop();
        System.out.println("Stack isEmpty : " + stack.isEmpty());
        System.out.println("push e");
        stack.push("e");
        System.out.println("Stack peek : " + stack.peek());
    }
}

class Node {
    Node next;
    int val;

    public Node() {
        this.val = 0;
        this.next = null;
    }

    public Node(int item) {
        this.val = item;
        this.next = null;
    }
}

class StackLinkedListDemo {
    Node top;
    public StackLinkedListDemo() {
        this.top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    } 

    public boolean isFull() {
        return false;
    }
    
    public void push(int item) {
        if (!isFull()) {
            Node newItem = new Node(item);
            newItem.next = top;
            top = newItem;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int temp = top.val;
            top = top.next;
            return temp;
        }
        return -1;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.val;
        }
        return -1;
    }
}

class StackArrayDemo {
    int[] array;
    int top;
    public StackArrayDemo() {
        this.top = 0;
        this.array = new int[10];
    }

    public boolean isFull() {
        if (this.top == this.array.length-1) {
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.top == 0) return true;
        return false;
    }
    
    public void push(int item) {
        if(!isFull()) {
            this.top++;
            this.array[top] = item;
        }
    }

    public int pop() {
        if(!isEmpty()) {
            int item = this.array[top];
            this.array[top] = 0;
            top--;
            return item;
        }
        return -1;
    }

    public int peek() {
        if(!isEmpty()) {
            return this.array[top];   
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i <= this.top; i++) {
            result += this.array[i] + " ";
        }
        return result; 
    } 
}