package Queues;

/**
 * Implementation of a basic Queue
 */
public class Queue {

    private char q[];
    private int tail, head;
    private int size;

    // First in first out
    // Adds elements by enqueue, places them at the tail
    // Removes elements by dequeue, removes from the head
    // Queue basics: http://www.studytonight.com/data-structures/queue-data-structure
    Queue(int size) {
        q = new char[size];
        tail = head = 0;
        this.size = size;
    }


    public int getMaxSize() {
        return size;
    }

    public int getCurrentSize() {
        // TODO - finish this method
        return -1;
    }

    public char peek() {
        return q[head];
    }

    // Puts a char into the queue
    public void enqueue(char ch) {
        if (tail == q.length) {
            System.out.println("Queue is full");
            return;
        }
        q[tail++] = ch;
    }

    // Gets current char off the bottom of the queue
    public char dequeue() {
        if (head == tail) {
            System.out.println("Nothing in queue");
            return (char) -1;
        }
        return q[head++];
    }
}
