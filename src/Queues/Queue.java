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
    /** Returns head value if index is out of bounds */
    public int peek(int index) {
        if (index < 0 || index > size) {
            return q[head];
        } else {
            return q[index];
        }
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

    public void quickSort() {
        qs(q,0,size-1);
    }

    private void qs(int[] list, int left, int right) {

        int newLeft, newRight;
        int pivot, temp;

        newLeft = left;
        newRight = right;
        pivot = list[(left + right)/2];

        do {
            //scroll through list until list[newleft] is higher than pivot, or you reach the end of the list
            while ((list[newLeft] < pivot) && (newLeft < right)) newLeft++;
            //scroll through list from right until list[newright] is less than pivot, or you reach the end of the list
            while ((list[newRight] > pivot) && (newRight > left)) newRight--;

            //swap list[newLeft] and list[newRight], making list[newLeft] now lower than pivot, and list[newRight] higher than pivot
            if (newLeft <= newRight) {
                temp = list[newLeft];
                list[newLeft] = list[newRight];
                list[newRight] = temp;
                newLeft++; newRight--;
            }
        } while (newLeft <= newRight);

        if (left < newRight) qs(list,left,newRight);
        if (newLeft < right) qs(list,newLeft,right);
    }


}