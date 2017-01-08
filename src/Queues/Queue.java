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

    public int[] getArray() {
        return q;
    }

    public int peek() {
        return q[head];
    }

    // Puts an int into the queue
    public void enqueue(int num) {
        if (tail == q.length) {
            System.out.println("Queue is full");
            return;
        }
        q[tail++] = num;
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

    public void bubbleSort() {
        int temp;

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size - 1; ++j) {
                if (q[j] > q[j+1]) { // if out of order
                    // swap places
                    temp = q[j];
                    q[j] = q[j+1];
                    q[j+1] = temp;
                }
            }
        }
    }

    public void insertionSort() {
        int key;

        for (int i = 1; i < size; ++i) {
            key = q[i];
            int j = i-1;

            while (j >= 0 && key < q[j]) {
                q[j+1] = q[j]; // move higher number further in queue
                j--;
            }

            q[j+1] = key;
        }
    }

    public void selectionSort() {
        int placement;

        for (int i = 0; i < size; ++i) {
            int min = q[i];
            placement = i;
            // Go through array (starting at i), find i-th smallest element
            for (int j = i; j < size; ++j) {
                if (q[j] < min) {
                    min = q[j];
                    placement = j;
                }
            }
            // swap i-th smallest element (min) in i-th smallest place (q[i])
            q[placement] = q[i];
            q[i] = min;
        }
    }

    public void quickSort(int[] list, int left, int right) {

        if (left < right) {

            int newPivot = partition(list, left, right);
            quickSort(list, left, newPivot);
            quickSort(list, newPivot + 1, right);

        }
    }

    private int partition(int[] list, int left, int right) {

        int newLeft, newRight, pivot, temp;

        pivot = list[left];
        newLeft = left;
        newRight = right;

        while (true) {
            while (list[newLeft] < pivot && list[newLeft] != pivot) {
                newLeft++;
            }
            while (list[newRight] > pivot && list[newRight] != pivot) {
                newRight--;
            }
            if (newLeft < newRight) {
                temp = list[newLeft];
                list[newLeft] = list[newRight];
                list[newRight] = temp;
            } else {
                return newRight;
            }
        }


    }


}