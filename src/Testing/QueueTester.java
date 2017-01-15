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

    @Test
    public void testInsertionSort() {

        // Given
        Queue testQueue = new Queue(10);
        int sortedArray[] = new int[] {1,2,3,4,5,6,7,8,9,10};

        testQueue.enqueue(10);
        testQueue.enqueue(7);
        testQueue.enqueue(1);
        testQueue.enqueue(4);
        testQueue.enqueue(9);
        testQueue.enqueue(8);
        testQueue.enqueue(6);
        testQueue.enqueue(3);
        testQueue.enqueue(2);
        testQueue.enqueue(5);

        testQueue.insertionSort();

        Assert.assertEquals(testQueue.peek(0),sortedArray[0]);
        Assert.assertEquals(testQueue.peek(1),sortedArray[1]);
        Assert.assertEquals(testQueue.peek(2),sortedArray[2]);
        Assert.assertEquals(testQueue.peek(3),sortedArray[3]);
        Assert.assertEquals(testQueue.peek(4),sortedArray[4]);
        Assert.assertEquals(testQueue.peek(5),sortedArray[5]);
        Assert.assertEquals(testQueue.peek(6),sortedArray[6]);
        Assert.assertEquals(testQueue.peek(7),sortedArray[7]);
        Assert.assertEquals(testQueue.peek(8),sortedArray[8]);
        Assert.assertEquals(testQueue.peek(9),sortedArray[9]);

    }

    @Test
    public void testBubbleSort() {

        // Given
        Queue testQueue = new Queue(10);
        int sortedArray[] = new int[] {1,2,3,4,5,6,7,8,9,10};

        testQueue.enqueue(10);
        testQueue.enqueue(7);
        testQueue.enqueue(1);
        testQueue.enqueue(4);
        testQueue.enqueue(9);
        testQueue.enqueue(8);
        testQueue.enqueue(6);
        testQueue.enqueue(3);
        testQueue.enqueue(2);
        testQueue.enqueue(5);

        testQueue.bubbleSort();

        Assert.assertEquals(testQueue.peek(0),sortedArray[0]);
        Assert.assertEquals(testQueue.peek(1),sortedArray[1]);
        Assert.assertEquals(testQueue.peek(2),sortedArray[2]);
        Assert.assertEquals(testQueue.peek(3),sortedArray[3]);
        Assert.assertEquals(testQueue.peek(4),sortedArray[4]);
        Assert.assertEquals(testQueue.peek(5),sortedArray[5]);
        Assert.assertEquals(testQueue.peek(6),sortedArray[6]);
        Assert.assertEquals(testQueue.peek(7),sortedArray[7]);
        Assert.assertEquals(testQueue.peek(8),sortedArray[8]);
        Assert.assertEquals(testQueue.peek(9),sortedArray[9]);
    }

    @Test
    public void testSelectionSort() {

        // Given
        Queue testQueue = new Queue(10);
        int sortedArray[] = new int[] {1,2,3,4,5,6,7,8,9,10};

        testQueue.enqueue(10);
        testQueue.enqueue(7);
        testQueue.enqueue(1);
        testQueue.enqueue(4);
        testQueue.enqueue(9);
        testQueue.enqueue(8);
        testQueue.enqueue(6);
        testQueue.enqueue(3);
        testQueue.enqueue(2);
        testQueue.enqueue(5);

        testQueue.selectionSort();

        Assert.assertEquals(testQueue.peek(0),sortedArray[0]);
        Assert.assertEquals(testQueue.peek(1),sortedArray[1]);
        Assert.assertEquals(testQueue.peek(2),sortedArray[2]);
        Assert.assertEquals(testQueue.peek(3),sortedArray[3]);
        Assert.assertEquals(testQueue.peek(4),sortedArray[4]);
        Assert.assertEquals(testQueue.peek(5),sortedArray[5]);
        Assert.assertEquals(testQueue.peek(6),sortedArray[6]);
        Assert.assertEquals(testQueue.peek(7),sortedArray[7]);
        Assert.assertEquals(testQueue.peek(8),sortedArray[8]);
        Assert.assertEquals(testQueue.peek(9),sortedArray[9]);
    }
    @Test
    public void testQuickSort() {

        // Given
        Queue testQueue = new Queue(10);
        int sortedArray[] = new int[] {1,2,3,4,5,6,7,8,9,10};

        testQueue.enqueue(10);
        testQueue.enqueue(7);
        testQueue.enqueue(1);
        testQueue.enqueue(4);
        testQueue.enqueue(9);
        testQueue.enqueue(8);
        testQueue.enqueue(6);
        testQueue.enqueue(3);
        testQueue.enqueue(2);
        testQueue.enqueue(5);

        testQueue.quickSort();

        Assert.assertEquals(testQueue.peek(0),sortedArray[0]);
        Assert.assertEquals(testQueue.peek(1),sortedArray[1]);
        Assert.assertEquals(testQueue.peek(2),sortedArray[2]);
        Assert.assertEquals(testQueue.peek(3),sortedArray[3]);
        Assert.assertEquals(testQueue.peek(4),sortedArray[4]);
        Assert.assertEquals(testQueue.peek(5),sortedArray[5]);
        Assert.assertEquals(testQueue.peek(6),sortedArray[6]);
        Assert.assertEquals(testQueue.peek(7),sortedArray[7]);
        Assert.assertEquals(testQueue.peek(8),sortedArray[8]);
        Assert.assertEquals(testQueue.peek(9),sortedArray[9]);
    }

}
