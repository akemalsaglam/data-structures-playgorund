package datastructure.queue;

import error.QueueException;
import org.junit.Assert;
import org.junit.Test;

public class ArrayQueueTest {

    @Test(expected = QueueException.class)
    public void dequeue_QueueIsEmpty_ShouldThrowQueueIsEmptyException() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        arrayQueue.dequeue();
    }

    @Test
    public void dequeue_QueueIsNotEmpty_ShouldReturnFrontItem() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        Assert.assertEquals(1, (int) arrayQueue.dequeue());
    }

    @Test
    public void dequeue_QueueIsNotEmpty_ShouldDecreaseCurrentSize() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        arrayQueue.enqueue(1);
        arrayQueue.dequeue();
        Assert.assertTrue(arrayQueue.isEmpty());
    }

    @Test(expected = QueueException.class)
    public void dequeue_QueueIsGoingToBeEmpty_ShouldThrowQueueIsEmptyException() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        arrayQueue.enqueue(1);
        arrayQueue.dequeue();
        arrayQueue.dequeue();
    }

    @Test(expected = QueueException.class)
    public void enqueue_QueueIsGoingToBeFull_ShouldThrowQueueIsFullException() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(8);
        arrayQueue.enqueue(9);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(11);
    }

    @Test
    public void enqueue_QueueIsEmpty_ShouldAddItem() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        arrayQueue.enqueue(1);
        Assert.assertFalse(arrayQueue.isEmpty());
    }
}
