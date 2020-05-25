package datastructure.queue;

import error.QueueException;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListQueueTest {

    @Test
    public void test1() {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<Integer>();
        Assert.assertTrue(linkedListQueue.isEmpty());

        linkedListQueue.enqueue(1);
        linkedListQueue.enqueue(2);
        Assert.assertEquals(1, (int) linkedListQueue.getFront());

        linkedListQueue.dequeue();
        linkedListQueue.dequeue();
        Assert.assertTrue(linkedListQueue.isEmpty());

        linkedListQueue.enqueue(1);
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);

        linkedListQueue.dequeue();
        linkedListQueue.dequeue();
        Assert.assertEquals(3, (int) linkedListQueue.getFront());
    }


}
