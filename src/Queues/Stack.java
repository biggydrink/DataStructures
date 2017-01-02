package Queues;

/**
 * Created by Andrew on 1/1/2017.
 */
public class Stack {

    // Stack data structure
    // LIFO (last in, first out)
    // Basic Stack info: http://www.studytonight.com/data-structures/stack-data-structure
    private int size, top;
    private char[] s;

    public Stack(int size) {
        top = -1;
        this.size = size;
        char[] s = new char[size];
    }

    public int getMaxSize() {
        return size;
    }

    // Look at top element
    public char peek() {
        if (top == -1) {
            System.out.println("Nothing in stack");
            return (char) -1;
        }
        return s[top];
    }

    // Add an element to the top of the stack
    public void push(char ch) {
        if (top == size) {
            System.out.println("Stack is full");
            return;
        }
        s[top++] = ch;
    }

    // Remove element from top of the stack
    public char pop() {
        if (top == -1) {
            System.out.println("Nothing in stack");
            return (char) -1;
        }
        return s[top--];
    }
}
