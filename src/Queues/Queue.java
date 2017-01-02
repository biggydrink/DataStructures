package Queues;

/**
 * Implementation of a basic Queue
 */
public class Queue {

    private int[] q;
    private int tail, head;
    private int size;

    // First in first out
    // Adds elements by enqueue, places them at the tail
    // Removes elements by dequeue, removes from the head
    // Queue basics: http://www.studytonight.com/data-structures/queue-data-structure
    public Queue(int size) {
        q = new int[size];
        tail = head = 0;
        this.size = size;
    }

    public int getMaxSize() {
        return size;
    }

    public int peek() {
        return q[head];
    }

    // Puts an int into the queue
    public void enqueue(int ch) {
        if (tail == q.length) {
            System.out.println("Queue is full");
            return;
        }
        q[tail++] = ch;
    }

    // Gets current int off the end of the queue
    public int dequeue() {
        if (head == tail) {
            System.out.println("Nothing in queue");
            return -1;
        }
        return q[head++];
    }

    // Returns a printable string of the array
    public String printQueue() {
        String arrayStr = "";

        for (int i = 0; i < size; ++i) {
            arrayStr += q[i];
            if (i != size -1) {
                arrayStr += ",";
            }
        }

        return arrayStr;
    }
}