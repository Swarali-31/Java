class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class MyStack<T> {  
    private Node<T> top = null;

    public void push(T data) {
        Node<T> n = new Node<>(data);
        n.next = top;
        top = n;
    }

    public T pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = top.data;
        top = top.next;
        return value;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node<T> temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class Stack {  
    public static void main(String[] args) {
        MyStack<Integer> stk = new MyStack<>();  
        System.out.println("Pushing elements onto the stack:");
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.display();

        System.out.println("\nPopping an element from the stack:");
        System.out.println("Popped value: " + stk.pop());
        stk.display();

        System.out.println("\nPushing a new element (40) onto the stack:");
        stk.push(40);
        stk.display();

        System.out.println("\nChecking if the stack is empty: " + stk.isEmpty());

        System.out.println("\nPopping all elements from the stack:");
        while (!stk.isEmpty()) {
            System.out.println("Popped value: " + stk.pop());
        }
        stk.display();
    }
}

