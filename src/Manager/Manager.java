package Manager;

import Queues.Queue;
import java.util.Random;

/**
 * Created by Andrew on 1/1/2017.
 */
public class Manager {

    public static void main(String args[]) {

        //basicQueue();
        randomLargeQueueAndSort();

    }

    public static void randomLargeQueueAndSort() {
        Queue q = new Queue(10);
        Random rand = new Random();

        for (int i = 0; i < q.getMaxSize(); ++i) {
            q.enqueue(rand.nextInt(100));
        }

        System.out.println("Insertion sort");
        System.out.println("Before sort: \n" + q.printQueue());
        q.insertionSort();
        System.out.println("After sort: \n" + q.printQueue());

    }

    public static void basicQueue() {
        Queue q = new Queue(10);
        for (int i = 1; i < 11; ++i) {
            q.enqueue(i);
        }
        System.out.println(q.printQueue());
    }



}
