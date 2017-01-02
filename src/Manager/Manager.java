package Manager;

import Queues.Queue;

/**
 * Created by Andrew on 1/1/2017.
 */
public class Manager {

    public static void main(String args[]) {

        Queue q = new Queue(10);

        for (int i = 1; i < 11; ++i) {
            q.enqueue(i);
        }

        System.out.println(q.printQueue());

    }



}
