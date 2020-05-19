package datastructures;

import datastructure.CustomLinkedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CustomLinkedListTest {

    private Random random = new Random();

    @Test
    public void test1() throws Exception {
        CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
        list.addFirst(89);
        Assert.assertEquals(89, (int) list.getFirst());
        Assert.assertEquals(89, (int) list.getLast());
        Assert.assertEquals(1,  list.size());
    }

    @Test
    public void test2() throws Exception {
        CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
        list.addLast(13);
        Assert.assertEquals(13, (int) list.getFirst());
        Assert.assertEquals(13, (int) list.getLast());
        Assert.assertEquals(1,  list.size());
    }

    @Test
    public void test3() throws Exception {
        CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
        list.addLast(13);
        list.addFirst(24);
        Assert.assertEquals(24, (int) list.getFirst());
        Assert.assertEquals(13, (int) list.getLast());
        Assert.assertEquals(2,  list.size());
    }

    @Test
    public void test4() throws Exception {
        CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
        list.addLast(13);
        list.addFirst(24);
        list.addAt(1,33);
        Assert.assertEquals(24, (int) list.getFirst());
        Assert.assertEquals(13, (int) list.getLast());
        Assert.assertEquals(3,  list.size());
    }

}
