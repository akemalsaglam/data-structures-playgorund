package datastructure.stack;

import error.StackException;
import org.junit.Assert;
import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void test1() {
        Stack<Integer> arrayStack = new ArrayStack<Integer>();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        Assert.assertEquals(3, (int)arrayStack.peek());

        arrayStack.pop();
        Assert.assertEquals(2, (int)arrayStack.peek());

        arrayStack.push(4);
        Assert.assertEquals(4, (int)arrayStack.peek());
    }

    @Test
    public void test2() {
        Stack<Integer> arrayStack = new ArrayStack<Integer>();
        Assert.assertTrue(arrayStack.isEmpty());

        arrayStack.push(4);
        Assert.assertFalse(arrayStack.isEmpty());
    }

    @Test(expected = StackException.class)
    public void test3() {
        Stack<Integer> arrayStack = new ArrayStack<Integer>(3);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
    }

}
