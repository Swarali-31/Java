// package com.thealgorithms.datastructures.stacks;

// /**
//  * A generic interface for Stack data structures.
//  *
//  * @param <T> the type of elements in this stack
//  */
// public interface Stack<T> {

//     /**
//      * Adds an element to the top of the stack.
//      *
//      * @param value The element to add.
//      */
//     void push(T value);

//     /**
//      * Removes the element at the top of this stack and returns it.
//      *
//      * @return The element popped from the stack.
//      * @throws IllegalStateException if the stack is empty.
//      */
//     T pop();

//     /**
//      * Returns the element at the top of this stack without removing it.
//      *
//      * @return The element at the top of this stack.
//      * @throws IllegalStateException if the stack is empty.
//      */
//     T peek();

//     /**
//      * Tests if this stack is empty.
//      *
//      * @return {@code true} if this stack is empty; {@code false} otherwise.
//      */
//     boolean isEmpty();

//     /**
//      * Returns the size of this stack.
//      *
//      * @return The number of elements in this stack.
//      */
//     int size();

//     /**
//      * Removes all elements from this stack.
//      */
//     void makeEmpty();
// }


//COMMENTING IT ALL COZ I WAS CONFUSED :)
// FIRST TIME CONTRIBUTING TO A REPO..DONT MIND! :)
// HERE'S THE CODE TO SINGLY LINKEDLIST:

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




