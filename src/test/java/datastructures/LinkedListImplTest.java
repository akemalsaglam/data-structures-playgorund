package datastructures;

import datastructure.impl.LinkedListImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class LinkedListImplTest {

    private Random random = new Random();

    @Test
    public void test1() throws Exception {
        LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
        list.addFirst(89);
        Assert.assertEquals(89, (int) list.getFirst());
        Assert.assertEquals(89, (int) list.getLast());
        Assert.assertEquals(1,  list.size());
    }

    @Test
    public void test2() throws Exception {
        LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
        list.addLast(13);
        Assert.assertEquals(13, (int) list.getFirst());
        Assert.assertEquals(13, (int) list.getLast());
        Assert.assertEquals(1,  list.size());
    }

    @Test
    public void test3() throws Exception {
        LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
        list.addLast(13);
        list.addFirst(24);
        Assert.assertEquals(24, (int) list.getFirst());
        Assert.assertEquals(13, (int) list.getLast());
        Assert.assertEquals(2,  list.size());
    }

    @Test
    public void test4() throws Exception {
        LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
        list.addLast(13);
        list.addFirst(24);
        list.addAt(1,33);
        Assert.assertEquals(24, (int) list.getFirst());
        Assert.assertEquals(13, (int) list.getLast());
        Assert.assertEquals(3,  list.size());
    }

    @Test
    public void test5() throws Exception {
        LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
        list.addLast(13);
        list.addFirst(24);
        list.addAt(1,33);
        list.display();

        list.reverse();
        list.display();
    }

}
