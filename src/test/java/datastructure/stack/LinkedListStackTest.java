package datastructure.stack;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListStackTest {

    @Test
    public void test1() {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<Integer>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        Assert.assertEquals(3, (int)linkedListStack.peek());

        linkedListStack.pop();
        Assert.assertEquals(2, (int)linkedListStack.peek());

        linkedListStack.push(4);
        Assert.assertEquals(4, (int)linkedListStack.peek());
    }

    @Test
    public void test2() {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<Integer>();
        Assert.assertTrue(linkedListStack.isEmpty());

        linkedListStack.push(4);
        Assert.assertFalse(linkedListStack.isEmpty());
    }

}
