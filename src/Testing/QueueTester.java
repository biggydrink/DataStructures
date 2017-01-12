package Testing;

import Queues.Queue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Andrew on 1/1/2017.
 */
public class QueueTester {

    @Test
    public void testEnqueueAndPeek() {

        Queue testQueue = new Queue(10);
        int enqueueVal;

        // Given
        enqueueVal = 5;
        testQueue.enqueue(enqueueVal);

        // assertion
        Assert.assertEquals(testQueue.peek(),enqueueVal);
    }

    @Test
    public void testDequeue() {

        Queue testQueue = new Queue(10);
        int enqueueVal;
        int dequeueVal;

        // Given
        enqueueVal = 15;
        testQueue.enqueue(enqueueVal);

        // Test
        dequeueVal = testQueue.dequeue();
        Assert.assertEquals(dequeueVal,enqueueVal);
    }

    @Test
    public void testGetMaxSize() {

        // Given
        int queueMaxSize = 20;
        Queue testQueue = new Queue(queueMaxSize);

        // Test
        Assert.assertEquals(queueMaxSize,testQueue.getMaxSize());
    }
}
