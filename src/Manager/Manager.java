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

        /* manual list of 10
        q.enqueue(99);
        q.enqueue(58);
        q.enqueue(62);
        q.enqueue(9);
        q.enqueue(60);
        q.enqueue(3);
        q.enqueue(94);
        q.enqueue(58);
        q.enqueue(19);
        q.enqueue(52);
        */

        System.out.println("Quick sort");
        System.out.println("Before sort: \n" + q.printQueue());
        q.quickSort();
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
